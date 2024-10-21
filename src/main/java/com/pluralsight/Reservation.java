package com.pluralsight;

public class Reservation {
    private RoomType roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double pricePerNight;

    public Reservation(RoomType roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.pricePerNight = roomType.getPricePerNight(isWeekend);
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
        this.pricePerNight = roomType.getPricePerNight(isWeekend); // Recalculate price when room type changes
    }

    public double getPrice() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
        this.pricePerNight = roomType.getPricePerNight(isWeekend); // Recalculate price when weekend status changes
    }

    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }

    public enum RoomType {
        KING(139.00), DOUBLE(124.00);

        private double pricePerNight;

        RoomType(double price) {
            this.pricePerNight = price;
        }

        public double getPricePerNight(boolean isWeekend) {
            if (isWeekend) {
                return pricePerNight * 1.10; // Increase price by 10% if it's a weekend
            }
            return pricePerNight;
        }
    }
}




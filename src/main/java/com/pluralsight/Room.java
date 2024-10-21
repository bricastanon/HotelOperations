package com.pluralsight;

public class Room {
    private int NumberOfBeds;
    private double Price;
    private boolean IsOccupied;
    private boolean IsDirty;
    private boolean IsAvailable;

    //Getters
    public int getNumberOfBeds() {
        return NumberOfBeds;
    }
    public double getPrice() {
        return Price;
    }
    public boolean IsOccupied() {
        return IsOccupied;
    }
    public boolean IsDirty() {
        return IsDirty;
    }
    public boolean IsAvailable() {
        return IsAvailable;
    }

    //Setters
    public void setOccupied(boolean occupied) {
        this.IsOccupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.IsDirty = dirty;
    }
}

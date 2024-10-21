package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Get the price of a KING room for a weekend
        double kingPrice = Reservation.RoomType.KING.getPricePerNight(true);
        System.out.println("Price for KING room on weekend: $" + kingPrice);
        // Get the price of a DOUBLE room for a weekday
        double doublePrice = Reservation.RoomType.DOUBLE.getPricePerNight(false);
        System.out.println("Price for DOUBLE room on weekday: $" + doublePrice);

        Employee emp = new Employee("1234", "Brianna", "Front Desk", 25.00, 50.00);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getname());
        System.out.println("Department: " + emp.getdepartment());
        System.out.println("Pay Rate: $" + emp.getPayRate());
        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());
    }
}



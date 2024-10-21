package com.pluralsight;

public class Employee {

    private String Id;
    private String name;
    private String department;
    private double PayRate;
    private double HoursWorked;

    public Employee(String Id, String name, String department, double PayRate, double HoursWorked) {
        this.Id = Id;
        this.name = name;
        this.department = department;
        this.PayRate = PayRate;
        this.HoursWorked = HoursWorked;
    }
    public String getId() {
        return Id;
    }

    public String getname() {
        return name;
    }

    public String getdepartment() {
        return department;

    }

    public double getPayRate() {
        return PayRate;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }
    // Derived Getters
    public double getTotalPay() {
        return getRegularHours() * PayRate + getOvertimeHours() * PayRate * 1.5;
    }

    public double getRegularHours() {
        return Math.min(HoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, HoursWorked - 40);
    }
}

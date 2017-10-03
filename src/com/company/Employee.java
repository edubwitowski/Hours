package com.company;
import java.util.*;


public class Employee {


    //variables:
    private String Name;
    private String position;
    private boolean salary = false;//whether this is salary or hourly
    private String startDate;
    private double payRate;
    private int shift;

    public Employee() {
    }


    public Employee(String name, String position, boolean salary, String startDate, double payRate, int shift) {
        this.Name = name;
        this.position = position;
        this.salary = salary;
        this.startDate = startDate;
        this.payRate = payRate;
        this.shift = shift;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    public boolean isSalary() {
        return salary;
    }


    public void setSalary(boolean salary) {
        this.salary = salary;
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
//        this.shift = shift;
//    }
    }

}



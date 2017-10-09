package com.company;



public class Employee {

       //variables:
       public String name;
       public PositionTitle position = PositionTitle.ADMINISTRATION;
       public boolean salary = false;//whether this is salary or hourly is a placeholder

       public double payRate;
       public int shift;
       public String startDate;
       public double pay;
       public double weekPay;
       public double overTime;
       public String calculateString;







    public Employee(String name, PositionTitle position, boolean salary, double payRate, int shift, String startDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionTitle getPosition() {
        return position;
    }

    public void setPosition(PositionTitle position) {
        this.position = position;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
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
        this.shift = shift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Employee() {
    }

    public void calculate(double hoursWorked) {
        calculateString = " this week ";

       if (isSalary() == false && hoursWorked > 40) {
            overTime = hoursWorked - 40;
            hoursWorked = hoursWorked - overTime;
        }
        if (isSalary() == true){
           hoursWorked = 40;
           overTime = 0;
        }

        switch (getShift()){
            case 1:

                pay = getPayRate();
                weekPay = (pay * hoursWorked) + ((pay + (pay * 05)) * overTime);
                break;
            case 2:

                pay = (getPayRate() + (getPayRate() * 0.05));
                weekPay = (pay * hoursWorked) + ((pay + (pay * .5)) * overTime);
                break;

            case 3:

                pay = (getPayRate() + (getPayRate() * 0.1));
                weekPay = (pay * hoursWorked) + ((pay + (pay * .5)) * overTime);
                break;
                default:
                    weekPay = 0;
                    calculateString = " Did Not Work or Improper Shift ";
        }

        System.out.println("$" + weekPay + calculateString );
    }


public void display(){
        System.out.println(getName()+ "\n" + getPosition()+ "\n" + isSalary()+ "\n"+ getPayRate()+ "\n"+ getShift()+ "\n"+ getStartDate()+ "\n");
}

        }

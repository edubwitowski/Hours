package com.company;

public enum PositionTitle {


    
        private String name;
        position,
        salary,
        startDate,
        payRate,
        shift

    Position(String name) {
            this.name = name;
        }




    public class DemoPositonTitle
    {
        public static void main(String args[])

    PositionTitle pos = PositionTitle.name;
        if(pos = PositionTitle.position){
            System.out.println("PositionTitle is: ");
    } else if(pos = Directions.salary) {
        System.out.println("Your Salar is: salary");
    } else if(pos = Directions.startDate) {
        System.out.println("STARTDATE IS:  ");
    } else if(pos = Directions.payRate) {
        System.out.println("Your PayRate is:");
    } else if(pos = Directions.shift) {
        System.out.println("Your shift is:  ");





    }
    }
}








    }



        PositionTitle dir;
        public EnumDemo(Directions dir) {
            this.dir = dir;
        }
        public void getMyDirection() {
            switch (dir) {
                case name:
                    System.out.println("Is NAME ");
                    break;

                case position:
                    System.out.println("In Position");
                    break;

                case salary:
                    System.out.println("In SALARY");
                    break;

                case startDate:
                    System.out.println("StartDate");
                    break;

                case payRateystem.out.println("Is PayRate");
                    break;

                case shift:
                    System.out.println("In Shift");
                    break;

                default:
                    System.out.println("In South Direction");
                    break;
            }
        }

        public static void main(String[] args) {
            EnumDemo obj1 = new EnumDemo(Directions.NAME);
            obj1.getMyDirection();
            EnumDemo obj2 = new EnumDemo(Directions.SOUTH);
            obj2.getMyDirection();
        }
    }




}

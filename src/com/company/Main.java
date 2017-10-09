package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Employee worker1 = new Employee (" John Doe ", PositionTitle.ADMINISTRATION,true, 34.00, 1, "Februrary 17, 1978");

       Employee worker2 = new Employee (  " Jane Down",   PositionTitle.SECRETARIAL,false, 44.00, 3, "March 31 2008" );

        Employee worker3 = new Employee (   " Mike Left",PositionTitle.TECHNICAL, false, 56.00, 2, "Aug 8, 2012");

/**
 * True equals is salary
 */
        worker1.display();
        worker1.calculate(45);
        worker2.display();
        worker2.calculate(50);
        worker3.display();
        worker3.calculate(35);


    }
}


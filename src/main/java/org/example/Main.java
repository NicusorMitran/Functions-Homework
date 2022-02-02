/*
Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
The sorting should be done based on the amount of revenue generated via sales.
Each rep has a number of sales, and a quota / sale.

After the sorting, the first object should be the rep with the most revenue generated. The last object in the array should be the rep with the least revenue generated.

Eg:
Sales guy 1 has 10 sales with a quota of 500$. He has achieved 5000$ worth of sales.
Sales guy 2 has 7 sales with a quota of 800$. He has achieved 5600$ worth of sales.
*/

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String full1, full2 = "";
        Scanner sc = new Scanner(System.in);
    //    int xxx = 0;
    //    double ans = 0;

        salesGuy p1 = new salesGuy();
        p1.setName("Sales guy 1");
        p1.setSales(10);
        p1.setQuota(500);
    //    ans = p1.IncomeClaculator(10, 500);

        salesGuy p2 = new salesGuy();
        p2.setName("Sales guy 2");
        p1.setSales(70);
        p1.setQuota(800);
    //    ans = p2.IncomeClaculator(7, 800);

        ArrayList<Double> myAl = new ArrayList ();

        }
    }
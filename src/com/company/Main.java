package com.company;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputPrincipal = new Scanner(System.in);
        System.out.print("Principal:");
        int mortgageValue = inputPrincipal.nextInt();

        Scanner inputInterestRate = new Scanner(System.in);
        System.out.print("Annual Interest rate:");
        double interestRate = inputInterestRate.nextDouble();

        Scanner inputYears = new Scanner(System.in);
        System.out.print("Period (Years):");
        int period = inputYears.nextInt();

        double result = mortgageValue * interestRate * period;
        NumberFormat currency = NumberFormat.getNumberInstance();
        String value = currency.format(result);
        System.out.println(value);
    }
}


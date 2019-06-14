package com.rajeshchinni;

public class MinutesToYearsDaysCalculator {


    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }


    private static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (int) (((minutes / 60) / 24) / 365);
            long days = (int) (((minutes / 60) / 24) % 365);

            String yearsString = years + " y";
            if (years < 10) {
                yearsString = "0" + yearsString;
            }

            String daysString = days + " d";
            if (days < 10) {
                daysString = "0" + daysString;
            }

            String minutesString = minutes + " min";
            if (minutes < 10) {
                minutesString = "0" + minutesString;
            }

            System.out.println(minutesString + " = " + yearsString + " and " + daysString);
        }


    }




}
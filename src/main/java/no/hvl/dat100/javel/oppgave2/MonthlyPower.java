package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.*;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO
        for (int i = 0; i < usage.length; i++) {
            System.out.print("Strøm forbruk Dag " + (i + 1) + ": ");
            DailyPower.printPowerUsage(usage[i]);
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        // TODO
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Strømpris Dag " + (i + 1) + ": ");
            DailyPower.printPowerPrices(prices[i]);
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

       double sum = 0;

        // TODO

        for (int i = 0; i < usage.length; i++) {
            sum += DailyPower.computePowerUsage(usage[i]);
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        // TODO
        int i = 0;
        int j;
        while (!exceeded) {
            j = 0;
            while (j < (powerusage[i].length -1)) {
                usage += powerusage[i][j];
                j++;
                if (usage > threshold) {
                    exceeded = true;
                }
            }
            i++;
            if (i == powerusage.length) {
                break;
            }
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO
        for (int i = 0; i < prices.length; i++) {
            price += DailyPower.computeSpotPrice(usage[i], prices[i]);
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO
        for (int i = 0; i < prices.length; i++) {
            support += DailyPower.computePowerSupport(usage[i], prices[i]);
        }
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        // TODO
        for ( int i = 0; i < usage.length; i++ ) {
            price += DailyPower.computeNorgesPrice(usage[i]);
        }
        return price;
    }
}

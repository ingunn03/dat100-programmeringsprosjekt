package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO
        for (int i = 0; i < usage.length; i++) {
            System.out.print("Strøm forbruk Dag " + (i + 1) + ":");
            for (int j = 0; j < usage[i].length; j++) {
                System.out.print(" " + usage[i][j] + "kWh");
            }
            System.out.println();
        }
        return;
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        // TODO
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Strømpris Dag " + (i + 1) + ":");
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(" " + prices[i][j] + ",-");
            }
            System.out.println();
        }
        return;
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

       double sum = 0;

        // TODO

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j];
            }
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

        double sumkr = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                sumkr += prices[i][j];
            }
        }

        double sumkw = 0;
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sumkw += usage[i][j];
            }
        }

        price = sumkr / sumkw;

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                if ( prices[i][j] > 0.77 ) {
                    support += ((prices[i][j] - 0.77) * 0.1) * usage[i][j];
                }
            }
        }
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        // TODO
        for ( double[] i : usage ) {
            for ( double j : i ) {
                price += j * 0.45;
            }
        }
        return price;
    }
}

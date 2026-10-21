package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // a
        // DailyPower.printPowerPrices(powerprices_day);

        // b
        // DailyPower.printPowerUsage(powerusage_day);

        // c
        // double total = DailyPower.computePowerUsage(powerusage_day);
        // System.out.println("Total strømforbruk: " + total);

        // d
        // double total = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        // System.out.println("Spotpris: " + total);

        // e
        // double testStotteLavPris = DailyPower.getSupport(2.0, 0.5);
        // double testStotteHoyPris = DailyPower.getSupport(2.0, 1.9375);

        // System.out.println("Straumstøtte ved lav pris: " + testStotteLavPris);
        // System.out.println("Straumstøtte ved høy pris: " + testStotteHoyPris);

        // f
        // double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        // System.out.println("Total straumstøtte: " + totalSupport);

        // g
        // double norgesPrice = DailyPower.computeNorgesPrice(powerusage_day);
        // System.out.println("Totalpris med Norgespris: " + norgesPrice + " kr");

        // h
        // double peak = DailyPower.findPeakUsage(powerusage_day);
        // System.out.println("Høyeste forbruk (Peak): " + peak + " kWh");

        // i
        // double gjennomsnitt = DailyPower.findAvgPower(powerusage_day);
        // System.out.println("Gjennomsnittlig forbruk: " + gjennomsnitt + " kWh");

    }
}

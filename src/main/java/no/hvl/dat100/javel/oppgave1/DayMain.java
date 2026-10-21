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

        System.out.println("Oppgave A");
        DailyPower.printPowerPrices(powerprices_day);

        System.out.println("\n\nOppgave B");
        DailyPower.printPowerUsage(powerusage_day);

        System.out.println("\n\nOppgave C");
        double totalStrom = DailyPower.computePowerUsage(powerusage_day);
        System.out.println("Total strømforbruk: " + totalStrom + " kWh");

        System.out.println("\nOppgave D");
        double totalPris = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("Total spotpris: %.2f NOK", totalPris);

        // e
        // double testStotteLavPris = DailyPower.getSupport(2.0, 0.5);
        // double testStotteHoyPris = DailyPower.getSupport(2.0, 1.9375);

        // System.out.println("Straumstøtte ved lav pris: " + testStotteLavPris);
        // System.out.println("Straumstøtte ved høy pris: " + testStotteHoyPris);

        System.out.println("\n\nOppgave F");
        double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("Total straumstøtte: %.2f NOK", totalSupport);

        System.out.println("\n\nOppgave G");
        double norgesPrice = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println("Totalpris med Norgespris: " + norgesPrice + " NOK");

        System.out.println("\nOppgave H");
        double peak = DailyPower.findPeakUsage(powerusage_day);
        System.out.println("Høyeste forbruk (Peak): " + peak + " kWh");

        System.out.println("\nOppgave F");
        double gjennomsnitt = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("Gjennomsnittlig forbruk: %.5f kWh", gjennomsnitt);

    }
}

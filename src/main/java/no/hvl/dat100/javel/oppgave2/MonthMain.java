package no.hvl.dat100.javel.oppgave2;

import static no.hvl.dat100.javel.oppgave2.MonthlyPower.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        System.out.println("Oppgave 2A");
        print_PowerUsage(power_usage_month);

        System.out.println("\nOppgave 2B");
        print_PowerPrices(power_prices_month);

        System.out.println("\nOppgave 2C");
        System.out.printf("%.2f\n", computePowerUsage(power_prices_month));

        System.out.println("\nOppgave 2D");
        System.out.println(exceedThreshold(power_usage_month, 100));
        System.out.println(exceedThreshold(power_usage_month, 1000));

        System.out.println("\nOppgave 2E");
        System.out.printf("%.2f\n", computeSpotPrice(power_usage_month, power_prices_month));

        System.out.println("\nOppgave 2F");
        //90% av prisen over 77 øre uten mva. (96,25 øre med mva.) blir dekket av strømstøtten.
        System.out.printf("%.2f\n", computePowerSupport(power_usage_month, power_prices_month));

        System.out.println("\nOppgave 2G");
        //45 øre/kWh
        System.out.printf("%.2f\n", computeNorgesPrice(power_usage_month));
    }
}
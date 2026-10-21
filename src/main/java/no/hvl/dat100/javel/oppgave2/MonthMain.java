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

        System.out.println("Oppgave A");
        print_PowerUsage(power_usage_month);

        System.out.println("\nOppgave B");
        print_PowerPrices(power_prices_month);

        System.out.println("\nOppgave C");
        System.out.printf("Total månedlig forbruk: %.2f kWh\n", computePowerUsage(power_usage_month));

        System.out.println("\nOppgave D");
        System.out.println(exceedThreshold(power_usage_month, 100));
        System.out.println(exceedThreshold(power_usage_month, 1000));

        System.out.println("\nOppgave E");
        System.out.printf("Total spotpris: %.2f NOK\n", computeSpotPrice(power_usage_month, power_prices_month));

        System.out.println("\nOppgave F");
        System.out.printf("Total strømstøtte: %.2f NOK\n", computePowerSupport(power_usage_month, power_prices_month));

        System.out.println("\nOppgave G");
        System.out.printf("Total norgespris: %.2f NOK\n", computeNorgesPrice(power_usage_month));
    }
}
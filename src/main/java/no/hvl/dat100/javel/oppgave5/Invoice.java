package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.time.Month;
import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        // TODO - konstruktør
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {

        // TODO
        switch (this.c.getAgreement()) {
            case PowerAgreementType.NORGESPRICE:
                this.amount = MonthlyPower.computeNorgesPrice(usage);
                break;
            case PowerAgreementType.POWERSUPPORT:
                this.amount = MonthlyPower.computeSpotPrice(usage, prices) - MonthlyPower.computePowerSupport(usage, prices);
                break;
            case PowerAgreementType.SPOTPRICE:
                this.amount = MonthlyPower.computeSpotPrice(usage, prices);
                break;
        }
    }

    public void printInvoice() {

        // TODO
        System.out.println(c.toString());
        System.out.println();
        System.out.println(month);
        System.out.printf("Forbruk: %.2f kWh\n", MonthlyPower.computePowerUsage(usage));
        System.out.printf("Pris: %.2f NOK", amount);

    }
}

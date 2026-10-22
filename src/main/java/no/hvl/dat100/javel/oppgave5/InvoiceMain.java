package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave4.Customers;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        // TODO
        // Write code that uses the methods implemented in the Invoice-classes

        Customers customers = new Customers(4);
        Customer customer1 = new Customer("Padme", "padme@yahoo.mail", 32, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("Padaame", "padasdfme@yahoo.mail", 11, PowerAgreementType.SPOTPRICE);
        Customer customer3 = new Customer("Padmasdfe", "padmeasdfasdf@yahoo.mail", 3, PowerAgreementType.POWERSUPPORT);
        customers.addCustomer(customer1);
        customers.addCustomer(customer2);
        customers.addCustomer(customer3);

        Invoice invoice1 = new Invoice(customer1, "January", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice invoice2 = new Invoice(customer2, "February", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice invoice3 = new Invoice(customer3, "March", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Invoice[] invoices = new Invoice[customers.countNonNull()];
        invoices[0] = invoice1;
        invoices[1] = invoice2;
        invoices[2] = invoice3;

        Invoices.processInvoices(invoices);


    }
}

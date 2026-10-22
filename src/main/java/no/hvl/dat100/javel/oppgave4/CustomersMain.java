package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();


        // TODO
        // Write code that uses and tests the methods implemented in the Customers class

        // Oppgave A
        Customers customers = new Customers(7);

        // Oppgave B
        System.out.println("Oppgave B");
        System.out.println("Customer amount: " + customers.countNonNull());

        // Oppgave D
        System.out.println("\nOppgave D");
        Customer customer1 = new Customer("Padme", "padme@yahoo.mail", 3, PowerAgreementType.NORGESPRICE);
        customers.addCustomer(customer1);
        System.out.println("Customer amount: " + customers.countNonNull());

        // Oppgave C
        System.out.println("\nOppgave C");
        System.out.println("Customer ID for " + customer1.getName() + " is: " + customer1.getCustomer_id());

        // Oppgave E
        System.out.println("\nOppgave E");
        System.out.println("Info for fjernet customer: \n" + customers.removeCustomer(customer1.getCustomer_id()));
        System.out.println("\nCustomer amount: " + customers.countNonNull());

        // Oppgave F
        System.out.println("\nOppgave F");
        Customer customer2 = new Customer("Padme", "padme@yahoo.mail", 2, PowerAgreementType.NORGESPRICE);
        Customer customer3 = new Customer("Padme2", "padme@gay.mail", 18, PowerAgreementType.SPOTPRICE);
        customers.addCustomer(customer2);
        customers.addCustomer(customer3);
        for (int i = 0; i < customers.getCustomers().length; i++) {
            System.out.println(customers.getCustomers()[i]);
            System.out.println();
        }
    }
}

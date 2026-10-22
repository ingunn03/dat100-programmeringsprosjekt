package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();


        // TODO
        // Write code that creates a Customer object and teste the methods implemented in the class

        Customer customer1 = new Customer("Padme", "padme@yahoo.mail", 1, PowerAgreementType.NORGESPRICE);

        System.out.println(customer1.getCustomer_id());
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getAgreement());

        System.out.println();

        customer1.setCustomer_id(997);
        customer1.setName("xxHorseLordsxx");
        customer1.setEmail("myemailisepic@epicsauce.gay");
        customer1.setAgreement(PowerAgreementType.SPOTPRICE);


        System.out.println(customer1.toString());
    }
}

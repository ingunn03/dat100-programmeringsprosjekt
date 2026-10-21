package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        // TODO
        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        // TODO
        for ( int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        // TODO
        while (!funnet) {
            for ( int i = 0; i < customers.length; i++) {
                if (customers[i].getCustomer_id() == customer_id) {
                    funnet = true;
                }
            }
        }
        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        // TODO
        while (!inserted) {
            for ( int i = 0; i < customers.length; i++) {
                if (customers[i] == null) {
                    customers[i] = c;
                    inserted = true;
                    return inserted;
                }
            }
        }
        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        // TODO
        while (!deleted) {
            for ( int i = 0; i < customers.length; i++) {
                if (customers[i].getCustomer_id() == customer_id) {
                    Customer removedCustomer = customers[i];
                    customers[i] = null;
                    deleted = true;
                    return removedCustomer;
                }
            }
        }
        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] newCustomers = new Customer[this.countNonNull()];

        // TODO
        int j = 0;
        for ( int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                newCustomers[j] = customers[i];
                j++;
            }
        }
        return newCustomers;
    }
}
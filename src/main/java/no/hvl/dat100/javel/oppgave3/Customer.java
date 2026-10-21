package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // TODO - object variables (attributes)
    String name;
    String email;
    int customer_id;
    PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        // TODO
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;

    }

    // TODO - getter/setter methods for all objectvariables
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getCustomer_id() {
        return this.customer_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    // TODO - toString method
    public String toString() {
        return "Customer number: " + customer_id + "\nName: " + name + "\nEmail: " + email + "\nAgreement: " + agreement;
    }

}

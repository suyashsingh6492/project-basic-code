package parking_lot.payment;

//The customer can pay for the ticket either with an automated exit panel or pay the parking agent at the exit.
public class CreditCard extends Payment {

    @Override
    public boolean initiateTransaction() {
        return false;
    }
}

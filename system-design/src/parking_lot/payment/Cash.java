package parking_lot.payment;

import java.util.Date;

//The customer can pay for the ticket either with an automated exit panel or pay the parking agent at the exit.
public class Cash extends Payment {

    @Override
    public boolean initiateTransaction() {
        return false;
    }
}

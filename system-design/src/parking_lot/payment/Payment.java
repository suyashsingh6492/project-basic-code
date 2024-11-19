package parking_lot.payment;

import parking_lot.vehicle.Vehicle;

import java.util.Date;
//The customer can pay for the ticket either with an automated exit panel or pay the parking agent at the exit.
public abstract class Payment {
    private double amount;
    private PaymentStatus status;
    private Date createdOn;

    public abstract boolean initiateTransaction();
}

package parking_lot.ticket;

import parking_lot.parking.Entrance;
import parking_lot.parking.Exit;
import parking_lot.payment.Payment;
import parking_lot.vehicle.Vehicle;

import java.util.Date;

public class ParkingTicket {
    //it keeps track of the entrance and exit times of the vehicles, the amount, and the payment status.
    private int id;
    private Date entryDate;
    private Date exitDate;
    private double amount;
    private boolean status;

    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exitIns;

}

package parking_lot.vehicle;

import parking_lot.ticket.ParkingTicket;

public abstract class Vehicle {
    private String licenseNumber;
    public abstract void assignTicket(ParkingTicket ticket);
}

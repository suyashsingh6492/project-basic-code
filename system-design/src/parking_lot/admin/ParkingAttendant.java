package parking_lot.admin;

import parking_lot.DisplayBoard;
import parking_lot.parking.Entrance;
import parking_lot.parking.Exit;
import parking_lot.parking.ParkingSpot;

public class ParkingAttendant extends Account{
    // spot here refers to an instance of the ParkingSpot class
    public boolean processTicket(String ticketNumber){
        return false;

    }

    @Override
    public boolean resetPassword() {
        return false;
    }
}

package parking_lot.parking;

import parking_lot.vehicle.Vehicle;

public class Handicapped extends ParkingSpot {

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}

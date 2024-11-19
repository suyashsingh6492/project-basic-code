package parking_lot.parking;

import parking_lot.vehicle.Vehicle;

public class BikeSpot extends ParkingSpot {

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}

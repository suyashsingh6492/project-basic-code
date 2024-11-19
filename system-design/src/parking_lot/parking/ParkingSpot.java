package parking_lot.parking;

import parking_lot.vehicle.Vehicle;

import java.util.Map;

public abstract class ParkingSpot {
    private int id;
    private int maxCapacity;
    private Map<Integer, Vehicle> vehicle;

    public boolean getIsFree() {
        if (vehicle == null || vehicle.isEmpty()) return true;
        return maxCapacity <= vehicle.size();
    }

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle() {
        // definition
        return false;
    }

}

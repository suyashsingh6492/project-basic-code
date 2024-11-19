package parking_lot;

//class which will be a Singleton class, meaning the entire system will only have one instance of this class.

import parking_lot.parking.Entrance;
import parking_lot.parking.Exit;
import parking_lot.parking.ParkingSpot;
import parking_lot.ticket.ParkingTicket;
import parking_lot.vehicle.Vehicle;

import java.util.HashMap;
//https://github.com/AlphaDecodeX/ParkingLotSystemCode/blob/master/src/main/java/com/parkinglotsystem/main/enums/VehicleType.java
//https://github.com/KunalN25/parking-lot-app/blob/main/ParkingLot.java'
//This parking lot system is also composed of smaller objects that we have already designed,
// like entrance, exit, parking spots, parking rates, etc.
// Therefore, it will be a good practice to use the Abstract Factory and Factory design pattern
// to instantiate all those objects.
public class ParkingLot {
    private int id;
    private String name;
    private String address;
    private ParkingRate parkingRate;

    private HashMap<String, Entrance> entrance;
    private HashMap<String, Exit> exit;

    // Create a hashmap that identifies all currently generated tickets using their ticket number
    private HashMap<String, ParkingTicket> tickets;

    // The ParkingLot is a singleton class that ensures it will have only one active instance at a time
    // Both the Entrance and Exit classes use this class to create and close parking tickets
    private static ParkingLot parkingLot = null;

    // Created a private constructor to add a restriction (due to Singleton)
    private ParkingLot() {
        // Call the name, address and parking_rate
        // Create initial entrance and exit hashmaps respectively
    }

    // Created a static method to access the singleton instance of ParkingLot
    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public boolean addEntrance(Entrance entrance){
        return false;
    }
    public boolean addExit(Exit exit){
        return false;
    }

    // This function allows parking tickets to be available at multiple entrances
    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return null;
    }

    public boolean isFull(ParkingSpot type){
        return false;
    }
}

package parking_lot;

import parking_lot.parking.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
    //DisplayBoard and ParkingRate classes that only have the composition class with the ParkingLot class
    private int id;
    private Map<String, List<ParkingSpot>> parkingSpots;

    public DisplayBoard(int id) {
        this.id = id;
        this.parkingSpots = new HashMap<>();
    }

    // Member function
    public void addParkingSpot(String spotType, List<ParkingSpot> spots) {

    }

    public void showFreeSlot() {

    }
}

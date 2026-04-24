package com.example.demo.model;
import com.example.demo.enums.*;
import java.util.*;

public class ParkingLot {
    private List<ParkingSpot> spots = new ArrayList<>();
    private ParkingAvailabilityStatus status;
    

    public ParkingLot() {
    }

    public ParkingLot(List<ParkingSpot> spots, ParkingAvailabilityStatus status) {
        this.spots = spots;
        this.status = ParkingAvailabilityStatus.AVAILABLE;
    }

    public ParkingSpot findAvailableParkingSpot(VehicleType vehicleType){
        for (ParkingSpot obj:spots){
            if (( obj.getSupportedType() == vehicleType) && (obj.getStatus() == ParkingSpotStatus.FREE)){
                return obj;
            }
        }
        return null;
    }

        public boolean isFull() {
        for (ParkingSpot spot : spots) {
            if (spot.getStatus() == ParkingSpotStatus.FREE) {
                return false;
            }
        }
        this.status = ParkingAvailabilityStatus.FULL;
        return true;
    }

    public List<ParkingSpot> getSpots() {
        return this.spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public ParkingAvailabilityStatus getStatus() {
        return this.status;
    }

    public void setStatus(ParkingAvailabilityStatus status) {
        this.status = status;
    }

    public ParkingLot spots(List<ParkingSpot> spots) {
        setSpots(spots);
        return this;
    }

    public ParkingLot status(ParkingAvailabilityStatus status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ParkingLot)) {
            return false;
        }
        ParkingLot parkingLot = (ParkingLot) o;
        return Objects.equals(spots, parkingLot.spots) && Objects.equals(status, parkingLot.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spots, status);
    }

    @Override
    public String toString() {
        return "{" +
            " spots='" + getSpots() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
    
}

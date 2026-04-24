package com.example.demo.model;
import java.util.Objects;
import com.example.demo.enums.*;

public class ParkingSpot {
    private int id;
    private VehicleType supportedType;
    private ParkingSpotStatus status;
    private Vehicle currentVehicle;

    public ParkingSpot() {
    }

    public ParkingSpot(int id, VehicleType supportedType, ParkingSpotStatus status, Vehicle currentVehicle) {
        this.id = id;
        this.supportedType = supportedType;
        this.status = status;
        this.currentVehicle = currentVehicle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleType getSupportedType() {
        return this.supportedType;
    }

    public void setSupportedType(VehicleType supportedType) {
        this.supportedType = supportedType;
    }

    public ParkingSpotStatus getStatus() {
        return this.status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }

    public Vehicle getCurrentVehicle() {
        return this.currentVehicle;
    }

    public void setCurrentVehicle(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    public ParkingSpot id(int id) {
        setId(id);
        return this;
    }

    public ParkingSpot supportedType(VehicleType supportedType) {
        setSupportedType(supportedType);
        return this;
    }

    public ParkingSpot status(ParkingSpotStatus status) {
        setStatus(status);
        return this;
    }

    public ParkingSpot currentVehicle(Vehicle currentVehicle) {
        setCurrentVehicle(currentVehicle);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ParkingSpot)) {
            return false;
        }
        ParkingSpot parkingSpot = (ParkingSpot) o;
        return id == parkingSpot.id && Objects.equals(supportedType, parkingSpot.supportedType) && Objects.equals(status, parkingSpot.status) && Objects.equals(currentVehicle, parkingSpot.currentVehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, supportedType, status, currentVehicle);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", supportedType='" + getSupportedType() + "'" +
            ", status='" + getStatus() + "'" +
            ", currentVehicle='" + getCurrentVehicle() + "'" +
            "}";
    }
    
    public void parkVehicle(Vehicle vehicle){
        this.currentVehicle = vehicle;
        this.status = ParkingSpotStatus.OCCUPIED;
    }
    
}

package com.example.demo.model;
import java.util.Objects;
import com.example.demo.enums.*;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;

    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle vehicleNumber(String vehicleNumber) {
        setVehicleNumber(vehicleNumber);
        return this;
    }

    public Vehicle vehicleType(VehicleType vehicleType) {
        setVehicleType(vehicleType);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehicle)) {
            return false;
        }
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vehicleNumber, vehicle.vehicleNumber) && Objects.equals(vehicleType, vehicle.vehicleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNumber, vehicleType);
    }

    @Override
    public String toString() {
        return "{" +
            " vehicleNumber='" + getVehicleNumber() + "'" +
            ", vehicleType='" + getVehicleType() + "'" +
            "}";
    }
    
}

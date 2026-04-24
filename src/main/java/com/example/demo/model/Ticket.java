package com.example.demo.model;
import java.util.*;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private long entryTime;
    private long exitTime;
    private Random r = new Random();


    public Ticket( Vehicle vehicle, ParkingSpot parkingSpot, long entryTime) {
        this.ticketId = String.valueOf(r.nextInt(500));
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public long getEntryTime() {
        return this.entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public long getExitTime() {
        return this.exitTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket ticketId(String ticketId) {
        setTicketId(ticketId);
        return this;
    }

    public Ticket vehicle(Vehicle vehicle) {
        setVehicle(vehicle);
        return this;
    }

    public Ticket parkingSpot(ParkingSpot parkingSpot) {
        setParkingSpot(parkingSpot);
        return this;
    }

    public Ticket entryTime(long entryTime) {
        setEntryTime(entryTime);
        return this;
    }

    public Ticket exitTime(long exitTime) {
        setExitTime(exitTime);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) o;
        return Objects.equals(ticketId, ticket.ticketId) && Objects.equals(vehicle, ticket.vehicle) && Objects.equals(parkingSpot, ticket.parkingSpot) && entryTime == ticket.entryTime && exitTime == ticket.exitTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, vehicle, parkingSpot, entryTime, exitTime);
    }

    @Override
    public String toString() {
        return "{" +
            " ticketId='" + getTicketId() + "'" +
            ", vehicle='" + getVehicle() + "'" +
            ", parkingSpot='" + getParkingSpot() + "'" +
            ", entryTime='" + getEntryTime() + "'" +
            ", exitTime='" + getExitTime() + "'" +
            "}";
    }
    
}

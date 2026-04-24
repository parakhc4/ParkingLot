package com.example.demo.service;

import com.example.demo.enums.ParkingAvailabilityStatus;
import com.example.demo.enums.ParkingSpotStatus;
import com.example.demo.enums.PaymentType;
import com.example.demo.enums.VehicleType;
import com.example.demo.model.*;


public class ParkingService {
    private ParkingLot parkingLot;

    public ParkingService(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public Ticket parkVehicle(Vehicle vehicle){
        
        ParkingSpot spot = parkingLot.findAvailableParkingSpot(vehicle.getVehicleType());

        if (spot == null){
            return null;
        }
        else{
            spot.parkVehicle(vehicle);
            long entryTime = System.currentTimeMillis();
            return new Ticket(vehicle,spot,entryTime);
        }

    }

    public Payment exitVehicle(Ticket ticket){
        ticket.setExitTime(System.currentTimeMillis());
        long duration = ticket.getExitTime() -  ticket.getEntryTime();
        long amount;
        if (ticket.getVehicle().getVehicleType()  == VehicleType.BIKE){
             amount = duration*10;
        }
        else if (ticket.getVehicle().getVehicleType()  == VehicleType.AUTO)
        {
            amount = duration*20;
        }
        else{
            amount = duration*40;
        }

        ticket.getParkingSpot().setStatus(ParkingSpotStatus.FREE);
        return new Payment(ticket,amount,PaymentType.CASH);
    }

}

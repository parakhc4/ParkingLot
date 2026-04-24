package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.enums.VehicleType;
import com.example.demo.model.*;
import com.example.demo.service.ParkingService;

import java.util.*;


@RestController
public class ParkingController {

    private ParkingService parkingService;
    private ParkingLot lot;

    public ParkingController(){
        List<ParkingSpot> spots = new ArrayList<>();
        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.BIKE));
        spots.add(new ParkingSpot(VehicleType.CAR));
        spots.add(new ParkingSpot(VehicleType.CAR));
        spots.add(new ParkingSpot(VehicleType.AUTO));
        spots.add(new ParkingSpot(VehicleType.AUTO));
        this.lot = new ParkingLot(spots);
        this.parkingService = new ParkingService(lot);
    }

    @PostMapping("/park")
    public Ticket parkVehicle(@RequestBody Vehicle vehicle){
        return parkingService.parkVehicle(vehicle);
    }
    
    @PostMapping("/exit")
    public Payment exitVehicle(@RequestBody Ticket ticket){
        return parkingService.exitVehicle(ticket);
    }

    @GetMapping("/view")
    public List viewVehicles(){
        return parkingService.viewVehicles(this.lot);
    }
}
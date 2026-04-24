package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class ParkingController {

    @PostMapping("/park")
    public string parkVehicle(){
        return "Parking Endpoint hit";
    }

}

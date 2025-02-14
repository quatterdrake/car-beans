package com.example.car.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private final Fuel fuel;

    @Autowired
    public Engine(Fuel fuel) {
        this.fuel = fuel;
    }

    public String start() {
        return "Engine started using " + fuel.getFuelType();
    }
}

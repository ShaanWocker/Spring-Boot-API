package com.demo.rdsapi.controllers;

import com.demo.rdsapi.entities.Car;
import com.demo.rdsapi.repositories.CarRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping
    public Car saveCar(@RequestBody Car car){
        return carRepository.save(car);
    }

    @GetMapping
    public List<Car> findCars(){
        return carRepository.findAll();
    }

    @SneakyThrows
    @GetMapping("/{id}")
    public Optional<Car> findCar(@PathVariable int id){
        Optional<Car> car = carRepository.findById(id);
        return car;
    }
}

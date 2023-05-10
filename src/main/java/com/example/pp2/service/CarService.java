package com.example.pp2.service;

import com.example.pp2.model.Car;

import java.util.List;

public interface CarService {

    void AddCar(String model, String colour, String number);

    List<Car> getAllCars();

    List<Car> getNumberOfCars(int number);

    List<Car> getAllCarsSortedBy(String sortField);

    List<Car> getNumberOfCarsSortedBy(int number, String sortField);

}

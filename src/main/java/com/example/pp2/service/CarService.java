package com.example.pp2.service;

import com.example.pp2.exception.ControllerException;
import com.example.pp2.model.Car;

import java.util.List;

public interface CarService {

    void аddCar(String model, String colour, String number);

    List<Car> getCars(int count, String sortField) throws ControllerException;
}

package com.example.pp2.DAO;

import com.example.pp2.model.Car;

import java.util.List;

public interface CarDAO {
    
    void add(Car car);
    
    List<Car> listCars();

    Car getCarByNumber(String number);
}

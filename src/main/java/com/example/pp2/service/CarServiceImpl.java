package com.example.pp2.service;

import com.example.pp2.DAO.CarDAO;
import com.example.pp2.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Value("${maxCar}")
    private int maxCar;


    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carDAO.findAll().forEach(cars::add);
        return cars;
    }

    @Override
    public List<Car> getNumberOfCars(int number) {
        return getAllCars().stream().limit(number).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCarsSortedBy(String sortField) {
        List<Car> cars = new ArrayList<>();
        carDAO.findAll(Sort.by(Sort.Direction.ASC, sortField)).forEach(cars::add);
        return cars;
    }

    @Override
    public List<Car> getNumberOfCarsSortedBy(int number, String sortField) {
        return getAllCarsSortedBy(sortField).stream().limit(number).collect(Collectors.toList());
    }
}

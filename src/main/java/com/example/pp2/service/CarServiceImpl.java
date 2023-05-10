package com.example.pp2.service;

import com.example.pp2.CarProps;
import com.example.pp2.DAO.CarDAO;
import com.example.pp2.exception.ControllerException;
import com.example.pp2.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Autowired
    private CarProps carProps;

    @Override
    public void аddCar(String model, String colour, String number) {
        carDAO.save(new Car(model, colour, number));
    }

    @Override
    public List<Car> getCars(int count, String sortField) throws ControllerException {

        int maxCar = carProps.getMax_cars();
        List<String> disabledSort = carProps.getDisabledSort();
        List<Car> cars = new ArrayList<>();

        if (disabledSort.contains(sortField)) {
            throw new ControllerException(sortField);
        } else if (count == 0 || count > maxCar) {
            carDAO.findAll(Sort.by(Sort.Direction.ASC, sortField)).forEach(cars::add);
            return cars;
        }
        carDAO.findAll(Sort.by(Sort.Direction.ASC, sortField)).stream().limit(count).forEach(cars::add);
        return cars;
    }

}

package com.example.pp2.service;

import com.example.pp2.model.Car;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    List<Car> getNumberOfCars(int number);

//    Page< Car > getAllCarsSortedBy(String sortField);

    List< Car > getAllCarsSortedBy(String sortField);

    List< Car > getNumberOfCarsSortedBy(int number, String sortField);







//    void saveEmployee(Employee employee);
//    Employee getEmployeeById(long id);
//    void deleteEmployeeById(long id);
}

package com.example.pp2.controller;

import com.example.pp2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @Value("${maxCar}")
    private int maxCar;




    @GetMapping("/cars")
    public String getAll(@RequestParam(name = "count", required = false) String count,
                         @RequestParam(name = "sortBy", required = false) String sortBy,
                         Model model) {

        if ((count == null || Integer.valueOf(count) > maxCar) && sortBy == null) {
            model.addAttribute("cars", carService.getAllCars());
            return "cars";
        } else if ((count == null || Integer.valueOf(count) > maxCar) && sortBy != null) {
            model.addAttribute("cars", carService.getAllCarsSortedBy(sortBy));
        } else if ((count != null && sortBy == null)) {
            model.addAttribute("cars", carService.getNumberOfCars(Integer.valueOf(count)));
        } else if ((count != null && sortBy != null)) {
            model.addAttribute("cars", carService.getNumberOfCarsSortedBy(Integer.valueOf(count), sortBy));
        }


//        model.addAttribute("cars", carService.getNumberOfCars(Integer.valueOf(name)));
        return "cars";
    }
}


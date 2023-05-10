package com.example.pp2.controller;

import com.example.pp2.exception.ControllerException;
import com.example.pp2.service.CarService;
import org.hibernate.service.spi.ServiceException;
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

    @Value("${disabledSortFields}")
    private String disabledSortFields;

    @GetMapping("/cars")
    public String getAll(@RequestParam(name = "count", required = false, defaultValue = "0") int count,
                         @RequestParam(name = "sortBy", required = false, defaultValue = "id") String sortBy,
                         Model model) throws ControllerException {
        try {
            model.addAttribute("cars", carService.getCars(count, sortBy));
        } catch (ControllerException e) {
            throw e;
        }
        return "cars/cars";
    }
}


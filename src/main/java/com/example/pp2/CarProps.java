package com.example.pp2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "cars")
public class CarProps {

    private List<String> disabledSort;
    private int max_cars;

    public List<String> getDisabledSort() {
        return disabledSort;
    }

    public void setDisabledSort(List<String> disabledSort) {
        this.disabledSort = disabledSort;
    }

    public int getMax_cars() {
        return max_cars;
    }

    public void setMax_cars(int max_cars) {
        this.max_cars = max_cars;
    }
}
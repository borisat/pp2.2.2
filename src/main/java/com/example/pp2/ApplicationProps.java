package com.example.pp2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "cars")
public class ApplicationProps {

    private List<String> disabledSort;

    public List<String> getDisabledSort() {
        return disabledSort;
    }

    public void setDisabledSort(List<String> disabledSort) {
        this.disabledSort = disabledSort;
    }
}
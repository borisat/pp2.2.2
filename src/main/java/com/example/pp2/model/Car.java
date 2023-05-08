package com.example.pp2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "colour")
    private String colour;

    @Column(name = "number")
    private String number;

    public Car() {
    }

    public Car(String model, String colour, String number) {
        this.model = model;
        this.colour = colour;
        this.number = number;
    }

    public long getId() {
        return id;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", model=" + model +
                ", colour=" + colour +
                ", number=" + number + "]";
    }
}

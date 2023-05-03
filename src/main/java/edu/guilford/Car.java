package edu.guilford;

public class Car {
    // attributes 
    private String make;
    private String model;
    private int year;


    // constructor
    public Car() {
        this.make = make;
        this.model = model;
        this.year = year;


    }

    // getters and setters
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getYear() {
        return this.year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    // toString method
    public String toString() {
        return this.year + " " + this.make + " " + this.model;
    }


}

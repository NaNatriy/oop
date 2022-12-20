package oop;
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null) {
            this.country = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public Car() {
        this.brand = "default";
        this.model = "default";
        this.color = "белый";
        this.country = "default";
        this.engineVolume = 1.5;
        this.year = 2000;
    }

    @Override
    public String toString() {
        return  brand + " " + model + ", " + year + " год выпуска, сборка " + country  + ", " + color + " цвет, объем двигателя - " + engineVolume;
    }


}

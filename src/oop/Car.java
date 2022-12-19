package oop;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    Car() {
        this.brand = "default";
        this.model = "default";
        this.color = "белый";
        this.country = "default";

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        if (year <= 0) {
            year = 2000;
        }
    }

    @Override
    public String toString() {
        return  brand + " " + model + ", " + year + " год выпуска, сборка " + country  + ", " + color + " цвет, объем двигателя - " + engineVolume;
    }


}

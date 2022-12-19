package oop;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    @Override
    public String toString() {
        return  brand + " " + model + ", " + year + " год выпуска, сборка " + country  + ", " + color + " цвет, объем двигателя - " + engineVolume;
    }
}

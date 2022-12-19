package oop;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "жёлтый";
        lada.year = 2015;
        lada.country = "Россия";

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "Черный";
        audi.year = 2020;
        audi.country = "Германия";

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "Черный";
        bmw.year = 2021;
        bmw.country = "Германия";

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.year = 2018;
        kia.country = "Южная Корея";

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная Корея";

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }

}
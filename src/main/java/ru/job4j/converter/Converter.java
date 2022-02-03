package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float ruble = rubleToEuro(200);
        System.out.println("Euro: " + euro + " " + "Ruble: " + ruble);
    }
}

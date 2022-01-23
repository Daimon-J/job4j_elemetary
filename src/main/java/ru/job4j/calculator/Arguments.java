package ru.job4j.calculator;

public class Arguments {

    public static void add(int x, int z){
        int result = x + z;
        System.out.println(result);
    }

    public static void main(String[] args) {
        add(100,500);
        add(1,2);
        add(3,5);
    }
}

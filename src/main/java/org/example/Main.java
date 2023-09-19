package org.example;

public class Main {
    public static void main(String[] args) {
        CalculatingSum calculatingSum = new CalculatingSum();
        try {
            System.out.println(calculatingSum.calculating(3, 4, 6, 5));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
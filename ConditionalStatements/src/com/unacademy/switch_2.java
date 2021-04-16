package com.unacademy;

public class switch_2 {
    public static void main(String[] args) {
        String brand = "Samsung";
        switch(brand) {
            case "Samsung":
                System.out.println("Samsung");
                break;
            case "Motorola":
                System.out.println("Motorola");
                break;
            case "OnePlus":
                System.out.println("OnePlus");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            case "Huawei":
                System.out.println("Huawei");
                break;
            default:
                System.out.println("Other Phone");
        }
    }
}
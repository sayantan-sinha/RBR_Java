package com.unacademy;

public class switch_3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        switch(a) {
            case 1:
                System.out.println("a=1");
                switch (b) {
                    case 1:
                        System.out.println("b=1");
                        break;
                    case 2:
                        System.out.println("b=2");
                        break;
                    case 3:
                        System.out.println("b=3");
                        break;
                    default:
                        System.out.println("Invalid b");
                }
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 3:
                System.out.println("a=3");
                break;
            default:
                System.out.println("Invalid a");
        }
    }
}

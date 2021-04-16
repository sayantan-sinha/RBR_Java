package com.unacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String branch = "CS";
        if (branch == "CS") {
            System.out.println("Computer Science");
        } else if (branch == "ECE") {
            System.out.println("Electronics");
        } else if (branch == "EE") {
            System.out.println("Electrical");
        } else {
            System.out.println("Invalid Branch");
        }

        if (1 > 2) {
            System.out.println("1 greater than 2");
        } else {
            System.out.println("2 greater than 1");
        }
    }
}
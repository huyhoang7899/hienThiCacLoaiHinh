package com.company;

import java.util.Scanner;

public class Main {
    public static void rectangle() {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
        }
    }

    public static void squareTriangleBottonLeft() {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print("+");
            }
        }
    }

    public static void squareTr1iangleTopLeft() {
        for (int i = 7; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("%");
            }
        }
    }

    public static void isoscelesTriangle() {

    }

    public static void main(String[] args) {
        int choice =0;
        while (choice != 4){
        System.out.println("\nMenu : ");
        System.out.println("\t 1. Print the rectangle");
        System.out.println("\t 2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("\t 3. Print isosceles triangle");
        System.out.println("\t 4. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice : ");
        choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    squareTriangleBottonLeft();
                    squareTr1iangleTopLeft();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Not Choice");
            }
        }



    }
}

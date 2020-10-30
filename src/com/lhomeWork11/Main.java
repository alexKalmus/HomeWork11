package com.lhomeWork11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {11, 12, 13, 14, 15, 16};
        int[] arr3 = {121, 122, 123, 124, 125, 126};
        int choice;
        ArrayPrinter arrayPrinter;
        while(true){
            System.out.println("Choose type of print:");
            System.out.println("1. Print every element from new line");
            System.out.println("2. Print elements separated +");
            System.out.println("3. Print like >>1<<");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1: arrayPrinter = new NewLinePrint(); break;
                case 2: arrayPrinter = new PlusPrint(); break;
                case 3: arrayPrinter = new SuperPrint(); break;
                default: arrayPrinter = new DefaultPrint(); break;
            }
            arrayPrinter.print(arr1);
            arrayPrinter.print(arr2);
            arrayPrinter.print(arr3);
            System.out.println("Do you want to try adain?"+"\n"
            +"yes - 1"+"\n"
            +"no - another");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice != 1) break;
        }
    }
}

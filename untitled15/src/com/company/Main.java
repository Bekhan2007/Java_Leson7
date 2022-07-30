package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner scanner = new Scanner(in);

        System.out.println(" = ");
    int n = scanner.nextInt();
        int a = 1;
     for (int i = 1; i <= 10; i++) {
            a = n * i;         System.out.println(n + " * " + i + " = " + a);System.out.println(" = ");
       int n = scanner.nextInt();
     int a = 10;
     for (int i = 10; i >= 1; i--) {
            a = n * i;
           System.out.println(n + " * " + i + " = " + a);
        }

        for (int i = n; i >1  ; i--){

            if (i%2==0){
               System.out.println(i+" ");







            }


        }





































    }
}

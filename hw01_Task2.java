package com.company.hw01;

import java.util.Scanner;

public class Task2 {
    public void printRomb(int size){
        int escapes, stars;
        for(int i = 0; i < size; i++){
             escapes = size-(i + 1);
            for(int e = 0; e < escapes; e++){
                System.out.print(" ");
            }
            stars = size - escapes;
            for(int e = 0; e < stars; e++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = size-2; i >= 0; i--){
            escapes = size-(i + 1);
            for(int e = 0; e < escapes; e++){
                System.out.print(" ");
            }
            stars = size - escapes;
            for(int e = 0; e < stars; e++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

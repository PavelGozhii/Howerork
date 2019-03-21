package com.company.hw01;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix  extends Object implements Serializable {
    private int[][] matrix;
    private int height;
    private int width;
    private Matrix existring = null;
    private boolean sorted = false;

    public Matrix(int width, int height){
        matrix = new int[width][height];
        this.height = height;
        this.width = width;
    }

    public Matrix(int[][] matrix){
        existring = this;
        this.matrix = matrix;
    }

    public void printMatrix() {
        if (existring != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int e = 0; e < matrix[0].length; e++) {
                    System.out.print(matrix[i][e] + " ");
                }
                System.out.println("\n");
            }
        }else System.out.println("Error. An instance is not initialized");
    }

    public int[] getDiagonal(){
        if(existring != null){
            if(matrix.length != matrix[0].length){
                System.out.println("Matrix is not square");
                return null;
            }else{
                int[] array = new int[matrix.length];
                for(int i = 0; i < matrix.length; i++){
                    array[i] = matrix[i][i];
                }
                for(int i = 0; i < array.length; i++){System.out.print(array[i]);}
                return array;
            }
        }else{ System.out.println("Error. An instance is not initialized");
                return null;
        }
    }

    public int getMaxValue(){
        if(existring != null) {
            if (sorted == true) {
                return matrix[matrix.length - 1][matrix[0].length - 1];
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                for (int e = 0; e < matrix[0].length; e++) {
                    if (matrix[i][e] > max) {
                        max = matrix[i][e];
                    }
                }
            }
            return max;
        }else{
            System.out.println("Error. An instance is not initialized");
            return Integer.MIN_VALUE;
        }
    }

    public int getMinValue(){
        if(existring != null) {
            if (sorted == true) {
                return matrix[0][0];
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                for (int e = 0; e < matrix[0].length; e++) {
                    if (matrix[i][e] < min) {
                        min = matrix[i][e];
                    }
                }
            }
            return min;
        }else{
            System.out.println("Error. An instance is not initialized");
            return Integer.MAX_VALUE;
        }
    }

    public static int[][] sort(Matrix matrix){
        int[] arr = new int[matrix.matrix.length * matrix.matrix[0].length];
        int f = 0;
        for(int i = 0; i < matrix.matrix.length; i++) {
            for (int e = 0; e < matrix.matrix[0].length; e++) {
                 arr[f] = matrix.matrix[i][e];
                f++;
            }
        }
        Arrays.sort(arr);
        f = 0;
        for(int i = 0; i < matrix.matrix.length; i++) {
            for (int e = 0; e < matrix.matrix[0].length; e++) {
                matrix.matrix[i][e] = arr[f];
                f++;
            }
        }
        matrix.sorted = true;
        return matrix.matrix;
    }

}

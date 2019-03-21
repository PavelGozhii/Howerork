package com.company.hw01;

public class Task4 {
    public long getFactorial(int n){
        if(n == 1) return 1;
        return  n * getFactorial(n-1);
    }

    public long getFibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else
            return getFibonacci(n-1) + getFibonacci(n-2);
    }

    public float getCosTaylorSeries(float n, float x){
        if(n > 999){
            return 1;
        }
        return 1- x*x/((2 * n - 1) * 2 * n) * getCosTaylorSeries(n+1, x);
    }

    public float getSinTaylorSeries(float n, float x){
        return getCosTaylorSeries(n, (float) (x - 1.569));
    }

}

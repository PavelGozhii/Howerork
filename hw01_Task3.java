package com.company.hw01;

public class Task3 {
    public double getPow(float x, double pow){
        int m = 1;
        double result = x;
        int exp = 0;
        if(pow == 0){
            return 1;
        }
        for(int i = 0; i < pow; i ++){
            result*=x;
        }
        if(pow > 0){
            return result;
        }else if(pow < 0){
            return 1/result;
        }
        return result;
    }
}

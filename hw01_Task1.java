package com.company.hw01;

public class Task1 {
    public int resoltOfMatch(int firstResult, int secondResult, int firtsPromise, int secondPromise){
        return (firstResult == firtsPromise) && (secondResult == secondPromise) ? 2 :
                (firstResult > secondResult && firtsPromise > secondPromise)
                        || (firstResult < secondResult && firtsPromise < secondPromise)
                        || (firstResult == secondResult && firtsPromise == secondPromise) ? 1 : 0;
    }
}

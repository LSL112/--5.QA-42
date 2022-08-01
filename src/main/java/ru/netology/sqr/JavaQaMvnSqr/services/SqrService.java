package ru.netology.sqr.JavaQaMvnSqr.services;


public class SqrService {

    public int AmountSqr(int first,  int last) {
        int c = 0;
        for (int i = 10; i <= 99; i++) {
            if (first <= i * i && i * i <= last) {
                c++;
            }
        }
        return c;
    }

}

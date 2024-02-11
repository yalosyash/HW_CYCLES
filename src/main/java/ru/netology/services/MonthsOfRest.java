package ru.netology.services;

public class MonthsOfRest {
    public int monthsOfRest(int income, int expense, int threshold) {

        int account = 0;
        int months = 0;

        for (int i = 1; i <= 12; i++) {
            if (account >= threshold) {
                months++;
                account -= expense;
                account /= 3;
            } else account += income - expense;
        }
        return months;
    }
}
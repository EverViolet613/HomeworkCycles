package ru.netology.services;

public class Freelancer {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int money = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                counter++;
            } else
                money = money + income - expenses;
        }
        return counter;
    }
}

package com.company;

public class Main<clientDeviceYear> {

    public static void main(String[] args) {
        // 1.3 Условные операторы
        // Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientOSNew = 0;
        int clientDeviceYear = 2014;
        String devOS = "Android";
        if (clientOSNew == 0) {
            devOS = "iOS";
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + devOS + " по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для " + devOS + " по ссылке");
        }

        // Задача 2 (второй вариант решения)
        int clientOS2 = 1;
        int clientDeviceYear2 = 2013;
        if (clientOS2 == 1 && clientDeviceYear2 >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS2 == 1 && clientDeviceYear2 < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS2 == 0 && clientDeviceYear2 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задача 3
        int year = 2027;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }


        // Задача 4
        int deliveryDistance = 60;
        if (deliveryDistance >= 0 && deliveryDistance <= 20)
            System.out.println("Потребуется дней " + '1');
        else if (deliveryDistance >= 21 && deliveryDistance <= 60)
            System.out.println("Потребуется дней " + '2');
        else if (deliveryDistance >= 61 && deliveryDistance <= 100)
            System.out.println("Потребуется дней " + '3');


        //Задача 5
        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
        //Задача 6
        int age = 19;
        int salary = 58_000;
        int raisingLimit = 1;
        float salaryLimit = 1f;
        if (age >= 23) {
            raisingLimit *= 3;
        } else if (age < 23) {
            raisingLimit *= 2;
        }
        if (salary >= 80_000) {
            salaryLimit *= 1.5f;
        } else if (salary >= 50_000) {
            salaryLimit *= 1.2f;
        }
        float credit = salary * raisingLimit * salaryLimit;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + "рублей");

        //Задача 7
        int ageNew = 25;
        int salaryNew = 60_000;
        int wantedSum = 330_000;
        int loanTerm = 12;
        float basePercent = 10f;
        float halfSalary = 50f;
        float maxPayment = salaryNew * (halfSalary / 100);
        float payment;
        String decision;
        if (ageNew < 23) {
            basePercent += 1f;
        }
        if (ageNew < 30 && ageNew >= 23) {
            basePercent += 0.5f;
        }
        if (salaryNew > 80_000) {
            basePercent -= 0.7f;
        }
        payment = wantedSum * (1 + basePercent / 100) / loanTerm;
        if (payment <= maxPayment) {
            decision = "Одобрено";
        } else {
            decision = "Отказано";
        }
        System.out.println("Максимальный платеж при ЗП " + salaryNew + " равен " + maxPayment + "рублей. Платеж по кредиту " + payment + " рублей. " + decision);
    }
}


package com.company;

public class Main<clientDeviceYear> {

    public static void main(String[] args) {

        // Задача 1

        {
            int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Задача 2

        {
            {
                int clientOS = 0;
                int clientDeviceYear = 2014;
                String devOS = "Android";
                if (clientOS == 0) {
                    devOS = "iOS";
                }
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для " + devOS + " по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для " + devOS + " по ссылке");
                }

            }
        }

        // Задача 3

        {
            int year = 2027;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год является не високосным");
            }

        }

        // Задача 4

        {
            int deliveryDistance = 60;
            if (deliveryDistance >= 0 && deliveryDistance <= 20)
                System.out.println("Потребуется дней " + '1');
            else if (deliveryDistance >= 21 && deliveryDistance <= 60)
                System.out.println("Потребуется дней " + '2');
            else if (deliveryDistance >= 61 && deliveryDistance <= 100)
                System.out.println("Потребуется дней " + '3');
        }

        //Задача 5

        {
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
        }
    }
}


public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1");
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 2
        System.out.println("Задача 2");
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Task 3
        System.out.println("Задача 3");
        for (byte i = 0; i <= 17; i +=2) {
            System.out.println(i);
        }

        //Task 4
        System.out.println("Задача 4");
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task 5
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year +=4) {
            System.out.println(year + " год является високосным");
        }

        //Task 6
        System.out.println("Задача 6");
        for (byte i = 7; i <= 98; i +=7) {
            System.out.println(i);
        }

        //Task 7
        System.out.println("Задача 7");
        for (short i = 1; i <= 512; i *=2) {
            System.out.println(i);
        }

        //Task 8
        System.out.println("Задача 8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //Task 9
        System.out.println("Задача 9");
        int cache = 29000;
        int totalCache = 0;
        for (int i = 1; i <= 12; i ++) {
            totalCache +=cache;
            totalCache +=totalCache/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalCache + " рублей");
        }

        //Task 10
        System.out.println("Задача 10");
        byte i = 2;
        for (byte factor = 1; factor <= 10; factor++) {
            System.out.println(i + "х" + factor + "=" + i * factor);
        }
    }
}
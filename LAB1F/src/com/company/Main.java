//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random r = new Random();

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Введите количество книг:");
        int num = InputQuantity();
        Books[] books = new Books[num];
        InputData(books, num);
        OutputData(books, num);
        num = r.nextInt(3) + 1;
        System.out.println("\n\n\nКоличество продуктов: " + num);
        Product[] product = new Product[num];
        Input_OutputProduct(product, num);
    }

    public static int InputQuantity() {
        int num = 0;
        Scanner amount = new Scanner(System.in);

        do {
            String number = amount.nextLine();

            try {
                num = Integer.parseInt(number);
            } catch (Exception var4) {
                System.out.println("Неверный ввод");
            }

            if (num < 1) {
                System.out.println("Неверный ввод");
            }
        } while(num < 1);

        amount.close();
        return num;
    }

    public static void InputData(Books[] books, int num) {
        for(int i = 0; i < num; ++i) {
            books[i] = new Books();
            System.out.println("Книга №" + (i + 1) + ":");
            books[i].author = Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)];
            System.out.println("\nАвтор: " + books[i].author);
            books[i].genre = Dictionaries.getGenres()[r.nextInt(Dictionaries.getGenres().length)];
            System.out.println("\nЖанр: " + books[i].genre);
            books[i].name = Dictionaries.getNames()[r.nextInt(Dictionaries.getNames().length)];
            System.out.println("\nНазвание книги: " + books[i].name);
            books[i].edition = r.nextInt(15000) + 1;
            System.out.println("\nТираж: " + books[i].edition + "\n\n");
        }

    }

    public static void OutputData(Books[] books, int num) {
        System.out.println("Книга тираж которой не превышает 10000: ");

        for(int i = 0; i < num; ++i) {
            if (books[i].edition < 10000) {
                System.out.println("\nАвтор: " + books[i].author);
                System.out.println("\nЖанр: " + books[i].genre);
                System.out.println("\nНазвание книги: " + books[i].name);
                System.out.println("\nТираж: " + books[i].edition + "\n\n");
            }
        }

    }

    public static void Input_OutputProduct(Product[] product, int num) {
        for(int i = 0; i < num; ++i) {
            product[i] = new Product();
            product[i].name = Dictionaries.getProducts()[r.nextInt(Dictionaries.getProducts().length)];
            System.out.println("\nНазвание товара: " + product[i].name);
            product[i].term = r.nextInt(363) + 1;
            int month = r.nextInt(12) + 1;
            int year = 2021;
            int day = r.nextInt(28) + 1;
            String var10000 = Integer.toString(day);
            String time = var10000 + "-" + Integer.toString(month) + "-" + Integer.toString(year);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(time);
            product[i].date = LocalDateTime.of(year, month, day, 0, 0);
            System.out.println("\nСрок: " + product[i].term);
            LocalDateTime var10001 = product[i].date;
            System.out.println("\nДата производства: " + var10001.format(dtf));
            var10001 = product[i].date;
            System.out.println("\nГоден до: " + var10001.plusDays(product[i].term) + "\n\n");
            product[i].price = r.nextInt(500) + 1;
            product[i].N = r.nextInt(100000000) + 1;
        }

    }
}

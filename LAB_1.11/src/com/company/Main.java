package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static Random r = new Random();
    public static void main(String[] args) {
        //Базовый уровень
        System.out.println("Введите количество книг:");
        int num = InputQuantity();
        Books[] books = new Books[num];
        InputData(books, num);
        OutputData(books, num);
    }


    public static int InputQuantity(){
        int num =0;
        Scanner amount = new Scanner (System.in);
        String number;
        do{
            number = amount.nextLine();
            try {
                num = Integer.parseInt(number);
            }   catch (Exception e) {
                System.out.println("Неверный ввод");
            }
            if (num<1){
                System.out.println("Неверный ввод");
            }
        } while (num<1);
        amount.close();
        return num;
    }

    public static void InputData(Books[] books, int num) {
        for (int i = 0; i < num; i++){
            books[i] = new Books();
            System.out.println("Книга №" + (i+1) + ":");
            books[i].author = Dictionaries.getSurnames()[r.nextInt(Dictionaries.getSurnames().length)];
            System.out.println("\nАвтор: " + books[i].author);

            books[i].genre = Dictionaries.getGenres()[r.nextInt(Dictionaries.getGenres().length)];
            System.out.println("\nЖанр: " + books[i].genre);

            books[i].name = Dictionaries.getNames()[r.nextInt(Dictionaries.getNames().length)];
            System.out.println("\nНазвание книги: " + books[i].name);

            books[i].edition = r.nextInt(  15000) +1;
            System.out.println("\nТираж: " + books[i].edition + "\n\n");
        }
    }

    public static void OutputData(Books[] books, int num) {
        System.out.println("Книга тираж которой не превышает 10000: ");
        for (int i = 0; i < num; i++){
            if(books[i].edition < 10000){
                System.out.println("\nАвтор: " + books[i].author);
                System.out.println("\nЖанр: " + books[i].genre);
                System.out.println("\nНазвание книги: " + books[i].name);
                System.out.println("\nТираж: " + books[i].edition + "\n\n");
            }
        }
    }
}
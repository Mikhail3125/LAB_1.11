package com.company;

import java.time.LocalDateTime;

public class Product {
    String name;
    LocalDateTime date;
    int term;
    int price;
    int N;


    public Product() {
        String name;
        LocalDateTime date;
        int term;
        int price;
        int N;
    }


    public Product(String name, LocalDateTime date, int term, int price, int N) {
        this.name = name;
        this.date = date;
        this.term = term;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }
}
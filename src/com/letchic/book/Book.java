package com.letchic.book;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author[] authors;



    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", authors={" + Arrays.toString(authors) + "}, price=" + price +", qty=" + qty +"]";
    }

    public String getAutorNames(){
        String AutorNames=authors[0].getName();
        for(int i=1;i<authors.length;i++) {
            AutorNames=AutorNames+","+authors[i].getName();
        }
        return AutorNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Math.abs(book.price-price) <= 0.000001 &&
                qty == book.qty &&
                Objects.equals(name, book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, price, qty);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }
}

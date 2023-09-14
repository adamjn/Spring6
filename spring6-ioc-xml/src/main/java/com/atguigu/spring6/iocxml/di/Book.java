package com.atguigu.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    private String others;

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {


    }
}

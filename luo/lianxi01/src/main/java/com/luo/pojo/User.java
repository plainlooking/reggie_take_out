package com.luo.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String bookname;
    private String author;
    private String press;
    private Date date;
    private Float price;
    private Integer number;

    public User() {

    }

    public User(Integer id, String bookname, String author, String press, Date date, Float price, Integer number) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.press = press;
        this.date = date;
        this.price = price;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}

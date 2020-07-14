package Cacloaisach;

public class Book {
     String bookCode;
     String name;
     int price;
     String author;



    public Book(String bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public void setBookCode(String bookCode){
        this.bookCode = bookCode;
    }
    public String getBookCode() {
        return bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }



}

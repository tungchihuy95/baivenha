package Cacloaisach;

import Cacloaisach.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("000a", "hoahong",
                3, "Tung");
        //        System.out.println("BookCode:" + book.getBookCode());
//        System.out.println("Name:" + book.getName());
//        System.out.println("Price:" + book.getPrice());
//        System.out.println("Author:" + book.getAuthor());
//        System.out.println("Ngon ngu:" + book1.getLanguage());
        ProgrammingBook book1 = new ProgrammingBook("001", "Codegym", 5, "Kieuanh","C++","abc");
        ProgrammingBook book2 = new ProgrammingBook("002", "Codegym", 5, "Kieuanh","Java","abc");
        ProgrammingBook book3 = new ProgrammingBook("003", "Codegym", 5, "Kieuanh","Java","abc");
        ProgrammingBook book4 = new ProgrammingBook("004", "Codegym", 5, "Kieuanh","Python","abc");
        ProgrammingBook book5 = new ProgrammingBook("005", "Codegym", 5, "Kieuanh",".Net","abc");

        FictionBook fic1 = new FictionBook("006", "Codegym", 6, "chichau", "abc");
        FictionBook fic2 = new FictionBook("006", "Codegym", 6, "chichau", "abc");
        FictionBook fic3 = new FictionBook("006", "Codegym", 6, "chichau", "abc");
        FictionBook fic4 = new FictionBook("006", "Codegym", 6, "chichau", "abc");
        FictionBook fic5 = new FictionBook("006", "Codegym", 6, "chichau", "abc");

        int sum = (book1.getPrice() +book2.getPrice() +book3.getPrice()
                +book4.getPrice() +book5.getPrice()
        + fic1.getPrice() + fic2.getPrice()
        + fic3.getPrice() + fic4.getPrice()
        + fic5.getPrice());
        System.out.println("tong gia: " + sum);

        int count = 0;
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0]=book1;
        programmingBooks[1] = book2;
        programmingBooks[2] = book3;
        programmingBooks[3] = book4;
        programmingBooks[4] = book5;

        for (int i = 0; i < programmingBooks.length; i++) {
            if (programmingBooks[i].getLanguage() == "Java" ) {
                count++;
            }
        }
        System.out.println("Java:" + count);

        }
    }


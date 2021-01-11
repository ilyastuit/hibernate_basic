package com.ilyastuit.hibernate.basic;

import com.ilyastuit.hibernate.basic.entities.Author;
import com.ilyastuit.hibernate.basic.entities.Book;
import org.hibernate.Session;

public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        for (Book book: new BookHelper().getBookList()
        ) {
            System.out.println("book = " + book.getName());

        }
    }
}

package com.ilyastuit.hibernate.basic;

import org.hibernate.Session;

public class Start {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
    }
}

package com.mysite.hibernate;

import org.hibernate.Session;

/**
 * @author sachin
 */
public class MainApp {
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();

    // Check database version
    String sql = "select * from global_name";

    String result = (String) session.createNativeQuery(sql).getSingleResult();
    System.out.println(result);

    session.getTransaction().commit();
    session.close();

    
    HibernateUtil.shutdown();
  }
}
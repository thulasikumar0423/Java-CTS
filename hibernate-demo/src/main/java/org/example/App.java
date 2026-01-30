package org.example;

import org.example.entity.Employee;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        //Create

        Employee emp = new Employee("Thulasi","IT",7500);
       // Employee emp1 = new Employee("Swetha","IT",77500);
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
       // Employee emp2 = session.get(Employee.class,1);

       // session.save(emp);
        //session.save(emp1);

       // emp2.setSalary(85000);
       // session.save(emp);
       // emp.setSalary(85000);
        //session.update(emp2);
        session.delete(emp);
        tx.commit();
        session.close();

        System.out.println("Employee saved successfully");
    }

}
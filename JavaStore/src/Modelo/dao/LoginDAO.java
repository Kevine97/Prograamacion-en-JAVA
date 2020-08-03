/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import Modelo.HibernateUtil;
import Modelo.entities.Users;
import Service.Util;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Ara-PC
 */
public class LoginDAO {

    private final Session session;

    public LoginDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public Users getUserByUsername(String username) {
        Users user = null;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Users as a where a.username = :prUsername");
            query.setParameter("prUsername", username);
            user = (Users) query.list().get(0);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.commit();
        }
        return user;
    }

    public List<Users> getUsers(String username) {
        List<Users> users = new ArrayList();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Users as a where a.username like :prUsername");
            query.setParameter("prUsername", "%" + username + "%");
            users = query.list();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.commit();
        }
        return users;
    }

    public Users AddUser(Users user) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            Util.messageError("Error", e.getMessage());
            transaction.commit();
        }
        return user;
    }

    public void UpdateUser(Users user) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.commit();
        }
    }

    public void RemoveUser(Users user) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            transaction.commit();
        }
    }
}

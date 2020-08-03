package ui_javastore.service;

import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.Transaction;
import ui_javastore.model.HibernateUtil;
import ui_javastore.model.entities.Users;
import java.sql.Date;

public class LoginService {

    private Session session;
    

    public LoginService() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public Users getUsersByUsername(String username) {
        Users user = null;
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Users as a where a.username = :prUsername");
            query.setParameter("prUsername", username);
            user = (Users) query.list().get(0);
            transaction.commit();

        } catch (Exception e) {
            transaction.commit();
        }
        return user;

    }

    
     

}

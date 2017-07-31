package dao;

import com.sun.org.apache.xpath.internal.operations.String;
import model.AdminEntity;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by zhanggq on 2017/7/31.
 * 增删改查操作
 */
public class CRUD {
    private SessionFactory sessionFactory;

    public AdminEntity research(){
        AdminEntity adminEntity = null;
        sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            adminEntity = session.get(AdminEntity.class, new java.lang.String("xiaozhang"));
            System.out.println(adminEntity.getLastLogin());
            tx.commit();
        }catch (HibernateError e){
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }finally {
            sessionFactory.close();
            session.close();
            return adminEntity;
        }
    }
}

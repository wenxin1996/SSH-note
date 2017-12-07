package Dao;

import bean.Notebar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class NoteDaoImpl implements NoteDao {
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addNote(Notebar notebar){
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(notebar);
        tx.commit();
    }
    @Override
    public void deleteNotebar(int id){
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.delete("from Notebar notebar where notebar.id="+id);
        tx.commit();
    }
    @Override
    public void updateNotebar(Notebar notebar){
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.update(notebar);
        tx.commit();
    }
    @Override
    public List<Notebar> getAllNotebar(){
        List list=null;
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        list=s.createQuery("from Notebar notebar").list();
        tx.commit();
        return list;
    }
    @Override
    public Notebar getNotebarById(int id){
        List<Notebar> list=null;
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        list=s.createQuery("from Notebar notebar where id="+id).list();
        tx.commit();
        return list.get(0);
    }
    @Override
    public List<Notebar> getNotebarByPage(int page){
        List list=null;
        int firstnumber=5*(page-1);
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        list=s.createQuery("from Notebar notebar").setFirstResult(firstnumber).setMaxResults(5).list();
        tx.commit();
        return list;
    }

}

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
        Notebar notebar=null;
        return notebar;
    }
}

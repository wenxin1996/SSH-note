package Dao;

import bean.Note;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.management.Query;
import java.util.List;

public class NoteConImpl implements NoteCon{
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addNote(Note note){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(note);
        transaction.commit();
    }
    @Override
    public void deleteNote(String time){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete("from Note note where note.time="+time);
        transaction.commit();
    }
    @Override
    public void updateNote(Note notebar){

    }
    @Override
    public List<Note> getAllNote(){
        List list=null;
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        list=s.createQuery("from Note note").list();
        tx.commit();
        return list;
    }
    @Override
    public List<Note> getByBarId(int barid){
        List list=null;
        Session s=sessionFactory.openSession();
        Transaction transaction=s.beginTransaction();
        list=s.createQuery("from Note note where note.barid="+barid).list();
        transaction.commit();
        return list;
    }
    @Override
    public Note getlastNote(){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        List<Note> notes=session.createQuery("from Note order by id desc").setFirstResult(0).setMaxResults(1).list();
        Note note=notes.get(0);
        return note;
    }
}

package Dao;

import bean.Html;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class HTMLConImpl implements HTMLCon{
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addHtml(Html html) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(html);
        transaction.commit();
    }

    @Override
    public void deleteHtml(int id) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete("from Html html where html.id="+id);
        transaction.commit();
    }

    @Override
    public void updateHtml(Html html) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(html);
        transaction.commit();
    }

    @Override
    public List<Html> getAllHtml() {
        List list=null;
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        list=session.createQuery("from Html").list();
        transaction.commit();
        return list;
    }

    @Override
    public List<Html> getHtmlByNumber(int fistNumber,int maxNumber) {
        List list=null;
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        list=session.createQuery("from Html ").setFirstResult(fistNumber).setMaxResults(maxNumber).list();
        transaction.commit();
        return list;
    }

    @Override
    public Html getHtmlById(int id){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        List<Html> htmls=session.createQuery("from Html where id="+id).list();
        Html html=htmls.get(0);
        transaction.commit();
        return html;
    }
}

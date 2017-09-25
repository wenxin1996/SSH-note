package test;

import bean.Notebar;
import Dao.NoteDao;
import Dao.NoteDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class testNote {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");

        NoteDao ail = (NoteDao) ac.getBean("notbar");
        Notebar al = new Notebar();
        al.setHeadline("other");
        al.setLink("www.baidu.com");
        al.setNotenumber(6);
        ail.addNote(al);
    }
}

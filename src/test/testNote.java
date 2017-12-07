package test;

import bean.Notebar;
import Dao.NoteDao;
import Dao.NoteDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class testNote {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        NoteDao noteDao=(NoteDao) ac.getBean("notbar");
        Notebar notebar=noteDao.getNotebarById(6);
        notebar.setHeadline("secondlol");
        noteDao.updateNotebar(notebar);

        /*
        Notebar notebar=new Notebar();
        notebar.setHeadline("second");
        notebar.setId(6);
        notebar.setLink("baidu");
        notebar.setNotenumber(0);
        NoteDao noteDao=(NoteDao) ac.getBean("notbar");
        noteDao.addNote(notebar);

        NoteDao ail = (NoteDao) ac.getBean("notbar");
        List<Notebar> list=null;
        list=ail.getNotebarByPage(2);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getHeadline());
        }
        */
    }
}

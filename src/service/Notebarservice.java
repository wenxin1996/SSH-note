package service;

import Dao.NoteDaoImpl;
import bean.Notebar;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Notebarservice {

    @Autowired
    private NoteDaoImpl noteDao;

    public void setNoteDao(NoteDaoImpl noteDao) {
        this.noteDao = noteDao;
    }

    public List<Notebar> getallNotebar(){
        List list=new ArrayList();
        list=noteDao.getAllNotebar();
        return list;
    }

    public List<Notebar> getNotebarByPage(int page){
        List list=new ArrayList();
        list=noteDao.getNotebarByPage(page);
        return list;
    }

    public List<Notebar> getNotebar(int page){
        List list=new ArrayList();
        list=noteDao.getAllNotebar();
        return list;
    }

    public void add(Notebar notebar){
        noteDao.addNote(notebar);
    }

    public Notebar getNotebarById(int id){
        return noteDao.getNotebarById(id);
    }

    public void updataNotebar(Notebar notebar){
        noteDao.updateNotebar(notebar);
    }


}

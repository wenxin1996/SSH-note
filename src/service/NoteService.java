package service;

import Dao.NoteConImpl;
import Dao.NoteDaoImpl;
import bean.Note;
import bean.Notebar;
import service.GetTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class NoteService {
    @Autowired
    private NoteConImpl noteImp;

    public void setNote(NoteConImpl note) {
        this.noteImp = note;
    }

    public List<Note> getallnote(){
        return noteImp.getAllNote();
    }

    public void deleteNote(Note note){
        noteImp.deleteNote(note);
    }

    //添加note到数据库，若和最新note表记录的发布时间在同一天则新note的barid和之前的一样，否则加一
    public int add(Note note){
        int lastbarid=noteImp.getlastNote().getBarid();
        GetTime time=new GetTime();
        Date lastime=new Date();
        lastime=noteImp.getlastNote().getTime();
        try {
            if(time.sameDay(time.getTimeNow(),lastime))
                note.setBarid(lastbarid);
            else note.setBarid(lastbarid+1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        noteImp.addNote(note);
        if(note.getBarid()==lastbarid)return 1;//与之前记录在同一天返回1
        else return 0;//与之前记录不在同一天返回0
    }

    public List<Note> getbybarid(int id){
        return noteImp.getByBarId(id);
    }

    public Note getNote(int id){
        return noteImp.getNote(id);
    }

    public void updadeNote(Note note){noteImp.updateNote(note);}
}

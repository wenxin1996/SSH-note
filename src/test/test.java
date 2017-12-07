package test;

import Dao.NoteCon;
import Dao.NoteConImpl;
import bean.Note;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.NoteService;

public class test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");

        NoteService noteService=(NoteService)ac.getBean("noteservice");
        Note note=noteService.getNote(13);
        noteService.deleteNote(note);
        /*
        NoteCon noteCon=(NoteCon) ac.getBean("note");
        Note note=noteCon.getNote(18);
        note.setContent("123");
        noteCon.updateNote(note);
        System.out.println(note.getContent());*/
    }
}

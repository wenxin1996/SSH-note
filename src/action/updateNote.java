package action;

import bean.Note;
import org.springframework.beans.factory.annotation.Autowired;
import service.NoteService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class updateNote extends ActionSupport {
    private int id;
    private String content;
    @Autowired
    private NoteService noteservice;

    public void setNoteservice(NoteService noteservice) {
        this.noteservice = noteservice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String execute() throws Exception {
        Note note=noteservice.getNote(id);
        note.setContent(content);
        noteservice.updadeNote(note);
        return Action.SUCCESS;
    }

}


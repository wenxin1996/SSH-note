package action;

import bean.Notebar;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import service.NoteService;
import service.Notebarservice;
import bean.Note;

public class NoteAdd extends ActionSupport {
    private String content;
    private String password;
    @Autowired
    private NoteService noteService;

    @Autowired
    private Notebarservice NotebarService;

    public void setNotebar(Notebarservice notebarService) {
        NotebarService = notebarService;
    }

    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    public String getContent() {
        return content;
    }

    public String getPassword() {
        return password;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        Note note=new Note();
        note.setContent(content);
        note.setPassword(password);
        if(noteService.add(note)==0){
            Notebar notebar=new Notebar();
            notebar.setNotenumber(1);
            notebar.setHeadline("无标题");
            notebar.setLink("eyesOnYou");
            NotebarService.add(notebar);
        }
        return Action.SUCCESS;
    }
}

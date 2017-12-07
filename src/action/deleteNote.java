package action;
import bean.Note;
import org.springframework.beans.factory.annotation.Autowired;
import service.NoteService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
public class deleteNote extends ActionSupport{
    private int id;
    @Autowired
    private NoteService noteservice;

    public void setNoteservice(NoteService noteservice) {
        this.noteservice = noteservice;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        Note note=noteservice.getNote(id);
        noteservice.deleteNote(note);
        return Action.SUCCESS;
    }
}

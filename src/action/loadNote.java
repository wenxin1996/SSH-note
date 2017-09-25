package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import service.NoteService;

import java.util.ArrayList;
import java.util.List;

public class loadNote extends ActionSupport{
    private List list=new ArrayList();
    private int id;
    @Autowired
    private NoteService noteService;

    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    @Override
    public String execute() throws Exception {
        list=noteService.getbybarid(id);
        return Action.SUCCESS;
    }
}

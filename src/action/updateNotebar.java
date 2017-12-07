package action;

import bean.Notebar;
import org.springframework.beans.factory.annotation.Autowired;
import service.Notebarservice;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class updateNotebar extends ActionSupport{
    private int id;
    private String headline;
    @Autowired
    private Notebarservice getNotebar;

    public void setGetNotebar(Notebarservice getNotebar) {
        this.getNotebar = getNotebar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public String execute() throws Exception {
        Notebar notebar=getNotebar.getNotebarById(id);
        notebar.setHeadline(headline);
        getNotebar.updataNotebar(notebar);
        return Action.SUCCESS;
    }
}

package action;

import org.springframework.beans.factory.annotation.Autowired;
import service.Notebarservice;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class loadNotebar extends ActionSupport{
    private List list=new ArrayList();
    private int page=1;
    @Autowired
    private Notebarservice getNotebar;

    public void setGetNotebar(Notebarservice getNotebar) {
        this.getNotebar = getNotebar;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        list=getNotebar.getNotebarByPage(page);
        return Action.SUCCESS;
    }
}

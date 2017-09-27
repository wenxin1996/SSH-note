package action;

import Dao.HTMLConImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class loadHtmlbar extends ActionSupport {
    private List list=new ArrayList();
    @Autowired
    private HTMLConImpl htmlCon;

    public void setHtmlCon(HTMLConImpl htmlCon) {
        this.htmlCon = htmlCon;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        list= htmlCon.getAllHtml();
        return Action.SUCCESS;
    }
}

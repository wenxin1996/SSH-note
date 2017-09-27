package action;

import Dao.HTMLConImpl;
import bean.Html;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class loadHtml extends ActionSupport{
    private Html html;
    private int id;
    @Autowired
    private HTMLConImpl htmlCon;

    public void setHtmlCon(HTMLConImpl htmlCon) {
        this.htmlCon = htmlCon;
    }

    public Html getHtml() {
        return html;
    }

    public void setHtml(Html html) {
        this.html = html;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String execute() throws Exception {
        html=htmlCon.getHtmlById(id);
        return Action.SUCCESS;
    }
}

package action;

import Dao.HTMLConImpl;
import bean.Html;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class HtmlAdd extends ActionSupport{
    private String html;
    private String headline;
    private String picture;
    private String resume;
    private String link;
    @Autowired
    private HTMLConImpl htmlCon;

    public void setHtmlCon(HTMLConImpl htmlCon) {
        this.htmlCon = htmlCon;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public String getResume() {
        return resume;
    }

    public String getPicture() {
        return picture;
    }

    public String getHeadline() {
        return headline;
    }

    public String getHtml() {
        return html;
    }

    @Override
    public String execute() throws Exception {
        Html HTML=new Html();
        HTML.setHeadline(headline);
        HTML.setHtml(html);
        HTML.setPicture(picture);
        HTML.setResume(resume);
        HTML.setLink(link);
        htmlCon.addHtml(HTML);
        return Action.SUCCESS;
    }
}

package service;

import Dao.HTMLConImpl;
import bean.Html;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Htmlservice {
    @Autowired
    private HTMLConImpl htmlCon;

    public void setHtmlCon(HTMLConImpl htmlCon) {
        this.htmlCon = htmlCon;
    }

    public List<Html> getHtmlByNumber(int fistNumber, int maxNumber){
        List list=null;
        list=htmlCon.getHtmlByNumber(fistNumber,maxNumber);
        return list;
    }

    public Html getHtmlByid(int id){
        return htmlCon.getHtmlById(id);
    }
}

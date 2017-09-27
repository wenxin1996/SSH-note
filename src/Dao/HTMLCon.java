package Dao;
import bean.Html;

import java.util.List;

public interface HTMLCon {
    public void addHtml(Html html);

    public void deleteHtml(int id);

    public void updateHtml(Html html);

    public List<Html> getAllHtml();

    public List<Html> getHtmlByNumber(int firstNumber,int maxNumber);

    public Html getHtmlById(int id);
}

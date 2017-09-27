package bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Html {
    private int id;
    private Timestamp time;
    private String headline;
    private String resume;
    private String picture;
    private String link;
    private String html;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TIME", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "headline", nullable = true, length = 200)
    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Basic
    @Column(name = "resume", nullable = true, length = -1)
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Basic
    @Column(name = "picture", nullable = true, length = -1)
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "link", nullable = true, length = 300)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Basic
    @Column(name = "html", nullable = true, length = -1)
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Html html1 = (Html) o;

        if (id != html1.id) return false;
        if (time != null ? !time.equals(html1.time) : html1.time != null) return false;
        if (headline != null ? !headline.equals(html1.headline) : html1.headline != null) return false;
        if (resume != null ? !resume.equals(html1.resume) : html1.resume != null) return false;
        if (picture != null ? !picture.equals(html1.picture) : html1.picture != null) return false;
        if (link != null ? !link.equals(html1.link) : html1.link != null) return false;
        if (html != null ? !html.equals(html1.html) : html1.html != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (headline != null ? headline.hashCode() : 0);
        result = 31 * result + (resume != null ? resume.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (html != null ? html.hashCode() : 0);
        return result;
    }
}

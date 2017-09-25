package bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Notebar {
    private int id;
    private Timestamp time;
    private String headline;
    private String link;
    private Integer notenumber;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "headline", nullable = true, length = -1)
    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Basic
    @Column(name = "link", nullable = true, length = 200)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Basic
    @Column(name = "notenumber", nullable = true)
    public Integer getNotenumber() {
        return notenumber;
    }

    public void setNotenumber(Integer notenumber) {
        this.notenumber = notenumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notebar notebar = (Notebar) o;

        if (id != notebar.id) return false;
        if (time != null ? !time.equals(notebar.time) : notebar.time != null) return false;
        if (headline != null ? !headline.equals(notebar.headline) : notebar.headline != null) return false;
        if (link != null ? !link.equals(notebar.link) : notebar.link != null) return false;
        if (notenumber != null ? !notenumber.equals(notebar.notenumber) : notebar.notenumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (headline != null ? headline.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (notenumber != null ? notenumber.hashCode() : 0);
        return result;
    }
}

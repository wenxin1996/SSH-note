package bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Note {
    private Integer barid;
    private Timestamp time;
    private String content;
    private String password;
    private int id;

    @Basic
    @Column(name = "barid", nullable = true)
    public Integer getBarid() {
        return barid;
    }

    public void setBarid(Integer barid) {
        this.barid = barid;
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
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "password", nullable = true, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (id != note.id) return false;
        if (barid != null ? !barid.equals(note.barid) : note.barid != null) return false;
        if (time != null ? !time.equals(note.time) : note.time != null) return false;
        if (content != null ? !content.equals(note.content) : note.content != null) return false;
        if (password != null ? !password.equals(note.password) : note.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = barid != null ? barid.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}

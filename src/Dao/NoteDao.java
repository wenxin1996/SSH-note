package Dao;
import bean.Notebar;
import java.util.List;

public interface NoteDao {

    //添加
    public void addNote(Notebar notebar);

    //删除
    public void deleteNotebar(int id);

    //修改
    public void updateNotebar(Notebar notebar);

    //查询所有
    public List<Notebar> getAllNotebar();

    //根据学号查询
    public Notebar getNotebarById(int id);

    public List<Notebar> getNotebarByPage(int page);


}

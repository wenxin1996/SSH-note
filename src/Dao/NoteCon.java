package Dao;

import bean.Note;

import java.util.List;

public interface NoteCon {
    //添加
    public void addNote(Note note);

    //删除
    public void deleteNote(String time);

    //修改
    public void updateNote(Note note);

    //查询所有
    public List<Note> getAllNote();
    //by idbar
    public List<Note> getByBarId(int barid);

    public Note getlastNote();

}

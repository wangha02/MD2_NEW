package service.noteNguNgon;


import config.Config;
import model.Note;
import model.Story;

import java.util.ArrayList;
import java.util.List;

public class NoteService implements INoteNguNgon {

    public static List<Note> noteList = new ArrayList<>();

    static String PATH_NOTE = "C:\\Users\\Admin\\Downloads\\MD2-Role-master\\src\\database\\note.txt";

    static Config<List<Story>> notefig = new Config<>();

    static {
        if (notefig == null) {
            notefig = new Config<>();
        }
    }

    @Override
    public List<Note> findAll() {
        return null;
    }
}

package service.noteNguNgon;


import config.Config;
import model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteServiceIMPL implements INoteFables {
    static String PATH_NOTE = "C:\\Users\\Admin\\Downloads\\MD2-Role-master\\src\\database\\note.txt";

    static Config<List<Note>> config = new Config<>();

    static List<Note> noteList = config.read(PATH_NOTE);

    static {
        if (noteList == null) {
            noteList = new ArrayList<>();
        }
    }

    @Override
    public List<Note> findAll() {
        config.write(PATH_NOTE,noteList);
        return noteList;
    }
}

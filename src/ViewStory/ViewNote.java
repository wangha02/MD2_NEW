package ViewStory;

import config.Config;
import controller.NoteController;
import model.Note;

import java.io.*;
import java.util.List;

public class ViewNote {

    private static final String PATH_NOTE = "C:\\Users\\Admin\\Downloads\\MD2-Role-master\\src\\database\\note.txt";;
    NoteController noteController = new NoteController();

    List<Note> noteList = noteController.showListNote();

    public void NoteStory() throws IOException {
        System.out.println("1. Rua Va Tho");
        for (int i = 0; i < noteList.size(); i++) {
            noteList.get(i);

        }
        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                File file = new File(PATH_NOTE);
                InputStream in = new FileInputStream(file);
                InputStreamReader inSr = new InputStreamReader(in);
            int c;
                while ((c = inSr.read()) != -1){
                    System.out.println((char) c);
                }
                /// chưa xong
        }
    }
}

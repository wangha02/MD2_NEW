package controller;

import model.Note;
import service.noteNguNgon.INoteFables;
import service.noteNguNgon.NoteServiceIMPL;

import java.util.List;

public class NoteController {

   private final INoteFables noteFables = new NoteServiceIMPL();

   public List<Note> showListNote(){
       return noteFables.findAll();
   }
}

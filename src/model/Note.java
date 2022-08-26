package model;

import java.io.Serializable;

public class Note implements Serializable {

    private String note;

    public Note() {
    }

    public Note(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                '}';
    }
}

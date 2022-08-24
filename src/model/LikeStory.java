package model;

import java.io.Serializable;

public class LikeStory implements Serializable {
    private int id;
    private int idSong;
    private int idUser;

    public LikeStory() {
    }

    public LikeStory(int id, int idSong, int idUser) {
        this.id = id;
        this.idSong = idSong;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", idSong=" + idSong +
                ", idUser=" + idUser +
                '}';
    }
}

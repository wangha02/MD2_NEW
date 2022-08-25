package service.storyCoTich;

import model.Story;

import java.util.List;

public interface IFairyTaleService {
    List<Story> findAll(); //1

    List<Story> save(Story story); //2

    List<Story> edit(int id, String name); //3

    List<Story> sortByStory(); //4

    List<Story> search(String name); //5

    List<Story> remove(int id);   //6

    List<Story> findById(int id); //7

    List<Story> deleteById(int id); //8

    void updateData();


}

package controller;

import model.Story;
import service.storyCoTich.IFairyTaleService;
import service.storyCoTich.FairyTaleServiceIMPL;

import java.util.List;

public class StoryController {

    private final IFairyTaleService iFairyTaleService = new FairyTaleServiceIMPL();


    public List<Story> getStory(){
        return iFairyTaleService.findAll();
    }

    public List<Story> showListStory() {
        return iFairyTaleService.findAll();
    }


    public List<Story> findById(int id){
        return iFairyTaleService.findById(id);
    }


    public List<Story> createStory(String name) {
        return iFairyTaleService.save(new Story(showListStory().size()+1, name));
    }

    public List<Story> editStory(int id,String name){
        return iFairyTaleService.edit(id,name);
    }

    public List<Story> sortStory(){
        return iFairyTaleService.sortByName();
    }

    public List<Story> deleteStory(int id) {
        return iFairyTaleService.deleteById(id);
    }



}

package controller;

import model.Story;
import service.storyNguNgon.FablesServiceIMPL;
import service.storyNguNgon.IFablesService;

import java.util.List;

public class StoriesController {

    private final IFablesService iFablesService = new FablesServiceIMPL();

    public List<Story> showListStories() {
        return iFablesService.findAll();
    }

    public List<Story> findStoriesById(int id) {
        return iFablesService.findById(id);
    }

    public List<Story> sortStories() {
        return iFablesService.sortByStory();
    }

    public List<Story> deleteStories(int id) {
        return iFablesService.deleteById(id);
    }

}

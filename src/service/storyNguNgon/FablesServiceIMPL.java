package service.storyNguNgon;

import model.Story;

import java.util.ArrayList;
import java.util.List;

public class FablesServiceIMPL implements IFablesService {

    public static List<Story> storyList = new ArrayList<>();

    static {
        storyList.add(new Story(1, "Cáo và Quạ"));
        storyList.add(new Story(2, "Thỏ và Rùa"));
        storyList.add(new Story(3, "Thỏ và Chuột"));
        storyList.add(new Story(4, "Thỏ và Chó Sói"));

    }

    @Override
    public List<Story> findAll() {
        return storyList;
    }

    @Override
    public List<Story> save(Story story) {
        storyList.add(story);
        return storyList;
    }

    @Override
    public List<Story> edit(int id, String name) {
        storyList.get(id - 1).setName(name);
        return storyList;
    }

    @Override
    public List<Story> sortByStory() {
        return null;
    }

    @Override
    public List<Story> search(String name) {
        return null;
    }

    @Override
    public List<Story> remove(int id) {
        return null;
    }

    @Override
    public List<Story> findById(int id) {
        return null;
    }

    @Override
    public List<Story> deleteById(int id) {
        return null;
    }

    @Override
    public void updateData() {

    }
}

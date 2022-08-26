package service.storyNguNgon;

import model.Story;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(storyList);
        updateData();
        return storyList;
    }

    @Override
    public List<Story> search(String name) {
        List<Story> storyList1 = new ArrayList<>();
        for (Story story : storyList) {
            if (story.getName().equals(name)) {
                storyList1.add(story);
            }
        }
        return null;
    }

    @Override
    public List<Story> remove(int id) {
        storyList.remove(id - 1);
        return storyList;
    }

    @Override
    public List<Story> findById(int id) {
        List<Story> arrayList = new ArrayList<>();
        for (int i = 0; i < storyList.size(); i++) {
            arrayList.add(storyList.get(id-1));
            break;
        }
        return arrayList;
    }

    @Override
    public List<Story> deleteById(int id) {
        storyList.remove(id - 1);
        updateData();
        return storyList;
    }

    @Override
    public void updateData() {
        for (int i = 0; i < storyList.size(); i++) {
            storyList.get(i).setId(i + 1);
        }
    }
}

package service.storyCoTich;

import model.Story;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FairyTaleServiceIMPL implements IFairyTaleService {

    public static List<Story> listStory = new ArrayList<>();

    static {
        listStory.add(new Story(1, "Sọ Dừa"));
        listStory.add(new Story(2, "Chú Cuội"));
        listStory.add(new Story(3, "Tấm Cám"));
        listStory.add(new Story(4, "Thánh Gióng"));
    }

    @Override
    public List<Story> findAll() {
        return listStory;
    }

    @Override
    public List<Story> save(Story story) {
        listStory.add(story);
        return listStory;
    }

    @Override
    public List<Story> remove(int id) {
        listStory.remove(id - 1);
        return listStory;
    }


    @Override
    public List<Story> edit(int id, String name) {
        listStory.get(id - 1).setName(name);
        return listStory;
    }

    @Override
    public List<Story> sortByName() {
        Collections.sort(listStory);
        updateData();
        return listStory;
    }

    @Override
    public List<Story> findById(int id) {
        List<Story> arrayList = new ArrayList<>();
        for (int i = 0; i < listStory.size(); i++) {
            arrayList.add(listStory.get(id - 1));
            break;
        }
        return arrayList;
    }

    @Override
    public void updateData() {
        for (int i = 0; i < listStory.size(); i++) {
            listStory.get(i).setId(i + 1);
        }
    }

    @Override
    public List<Story> search(String name) {
        List<Story> stories = new ArrayList<>();
        for (Story story : listStory) {
            if (story.getName().equals(name)) {
                stories.add(story);
            }
        }
        return listStory;
    }

    @Override
    public List<Story> deleteById(int id) {
        listStory.remove(id-1);
        updateData();
        return listStory;
    }
}

package ViewStory;

import config.Config;
import controller.StoryController;
import model.Story;

import java.util.List;

public class ViewTruyenNguNgon {

    StoryController storyController = new StoryController();

    List<Story> storyList = storyController.showListStory();


    public void nguNgon() {
        System.out.println("0. Back Out");
        for (int i = 0; i < storyList.size() ; i++) {
            System.out.println(storyList.get(i));
        }
        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 0:
                new ViewTheLoai().theLoai();
            case 1:
                break;

        }
    }

}

package ViewStory;

import config.Config;
import controller.StoriesController;
import model.Story;

import java.util.List;

public class ViewFables {

    StoriesController storiesController = new StoriesController();

    List<Story> storyList = storiesController.showListStories();


    public void nguNgon() {
        System.out.println("0. Backs ");
        for (int i = 0; i < storyList.size() ; i++) {
            System.out.println("► " + storyList.get(i).getId() + ". " + storyList.get(i).getName());
//            System.out.println(storyList.get(i));
        }
        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 0:
                new ViewCategoryStory().theLoai();
                break;

        }
    }

}

package ViewStory;

import config.Config;
import controller.StoryController;
import model.Story;

import java.util.List;

public class ViewTruyenCoTich {

    StoryController storyController = new StoryController();

    List<Story> storyList = storyController.showListStory();


    public void coTich() {
        //USER
        System.out.println("0. Back ");
        System.out.println("1. Nhập 1 để đọc truyện");
        for (int i = 0; i < storyList.size(); i++) {
            System.out.println("► " + storyList.get(i).getId() + ". " + storyList.get(i).getName());
//            storyList.get(i)
        }
        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 0:
                new ViewTheLoai().theLoai();
                break;
                case 1:


        }
    }
}
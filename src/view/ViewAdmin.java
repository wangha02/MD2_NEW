package view;

import config.Config;
import controller.StoryController;
import model.Story;

import java.util.List;
import java.util.Scanner;

public class ViewAdmin {

    Scanner scanner = new Scanner(System.in);

    StoryController storyController = new StoryController();

    public void adMin() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ 1. Show Story              ║");
        System.out.println("║ 2. Edit Story              ║");
        System.out.println("║ 3. Update Story            ║");
        System.out.println("║ 4. Detail Story            ║");
        System.out.println("║ 5. Delete Story            ║");
        System.out.println("║ 6. Sort Story              ║");
        System.out.println("╚════════════════════════════╝");

        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                viewStory();
                break;
            case 2:
                editStory();
                break;
            case 3:
                updateStory();
            default:
                break;

        }
    }

    public void viewStory() {
        List<Story> storyList = storyController.showListStory();
        System.out.println("|--STT---------NAME----------------------------|");

        for (int i = 0; i < storyList.size(); i++) {
            System.out.println(
                    "|--" + storyList.get(i).getId() + "---------" + storyList.get(i).getName() + "-----------| ");
        }
    }

    public void editStory() {
        System.out.println("Enter stt want fix ?");
        int update = Integer.parseInt(Config.scanner().nextLine());
        System.out.println("Enter story want fix ?");
        String name = Config.scanner().nextLine();

        List<Story> storyEditList = storyController.editStory(update, name);
        for (int i = 0; i < storyEditList.size(); i++) {
            System.out.println(
                    "|--" + storyEditList.get(i).getId() + "---------" + storyEditList.get(i).getName() + "-----------| ");
        }
    }

    public void updateStory() {
        System.out.println("Enter stt want to add ?");
        int update = Integer.parseInt(Config.scanner().nextLine());
        System.out.println("Enter story wan to add ? ");
        String name = Config.scanner().nextLine();

        List<Story> updateStoryList = storyController.editStory(update, name);
        for (int i = 0; i < updateStoryList.size(); i++) {
            System.out.println(
                    "|--" + updateStoryList.get(i).getId() + "---------" + updateStoryList.get(i).getName() + "-----------| ");
        }

    }
}

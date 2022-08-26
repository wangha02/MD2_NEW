package view;

import config.Config;
import controller.StoriesController;
import controller.StoryController;
import model.Story;

import java.util.List;
import java.util.Scanner;

public class ViewAdmin {

    Scanner scanner = new Scanner(System.in);

    StoryController storyController = new StoryController();

    StoriesController storiesController = new StoriesController();


    public void adMin() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║ 0. Show Story Fairy Tale.            ║");
        System.out.println("║ 1. Show StoryStories Fables.         ║");
        System.out.println("║ 2. Edit Story.                       ║");
        System.out.println("║ 3. Update Story.                     ║");
        System.out.println("║ 4. Detail Story Fairy Tale.          ║");
        System.out.println("║ 5. Detail Stories Fables.            ║");
        System.out.println("║ 6. Delete Story Fairy Tale.          ║");
        System.out.println("║ 7. Delete Stories Fables.            ║");
        System.out.println("║ 8. Sort Story.                       ║");
        System.out.println("║ 9. Sort Stories.                     ║");
        System.out.println("╚══════════════════════════════════════╝");

        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 0:
                viewStory();
                break;
            case 1:
                viewStories();
                break;
            case 2:
                editStory();
                break;
            case 3:
                updateStory();
                break;
            case 4:
                detailStory();
                break;
            case 5:
                detailStories();
                break;
            case 6:
                deleteStory();
                break;
            case 7:
                deleteStories();
                break;
            case 8:
                sortStory();
                break;
            case 9:
                sortStories();
                break;
            default:
                break;

        }
    }

    public void viewStory() {
        List<Story> storyList = storyController.showListStory();
        System.out.println("|STT|       NAME          ");

        for (int i = 0; i < storyList.size(); i++) {
            System.out.println(
                    "| " + storyList.get(i).getId() + " |" + "      " + storyList.get(i).getName());
        }
    }

    public void viewStories() {
        List<Story> storyListOne = storiesController.showListStories();
        System.out.println("|STT|        NAME              ");

        for (int i = 0; i < storyListOne.size(); i++) {
            System.out.println(
                    "| " + storyListOne.get(i).getId() + " |" + "      " + storyListOne.get(i).getName());
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
                    "| " + storyEditList.get(i).getId() + "      " + storyEditList.get(i).getName() + "-----------| ");
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
                    "| " + updateStoryList.get(i).getId() + "      " + updateStoryList.get(i).getName() + "-----------| ");
        }
    }

    public void deleteStory() {
        System.out.println("Enter ID STORY want to delete ?");
        int id = Integer.parseInt(Config.scanner().nextLine());
        if (!isValid(id)) {
            System.out.println("Ranger out side ID  !!");
            return;
        }
        System.out.println("Choose Yes or No (Y / N) ?");
        String check = scanner.nextLine();
        if (check.equalsIgnoreCase("Y")) {
            storyController.deleteStory(id);
        } else if (check.equalsIgnoreCase("N")) {
            System.out.println("No Delete !");
        } else {
            System.out.println("Option no fit ");
        }
        List<Story> storyDelete = storyController.sortStory();

        System.out.println("|STT|           NAME              |");
        for (int i = 0; i < storyDelete.size(); i++) {
            System.out.println(
                    "| " + storyDelete.get(i).getId() + "      " + storyDelete.get(i).getName() + "-----------| ");
        }
    }

    public void deleteStories() {
        System.out.println("Enter ID STORIES want to delete ?");
        int id = Integer.parseInt(Config.scanner().nextLine());
        if (!isValid(id)) {
            System.out.println("Ranger out side ID  !!");
            return;
        }
        System.out.println("Choose Yes or No (Y / N) ?");
        String check1 = scanner.nextLine();
        if (check1.equalsIgnoreCase("Y")) {
            storiesController.deleteStories(id);
        } else if (check1.equalsIgnoreCase("N")) {
            System.out.println("No Delete !!!");
        } else {
            System.out.println("Option no fit ");
        }

        List<Story> storyDelete = storiesController.sortStories();

        System.out.println("|STT|                  NAME              |");
        for (int i = 0; i < storyDelete.size(); i++) {
            System.out.println(
                    "| " + storyDelete.get(i).getId() + "      " + storyDelete.get(i).getName() + "-----------| ");
        }
    }


    public void detailStory() {
        System.out.println("Enter ID Story want to find ?");
        int id = Integer.parseInt(Config.scanner().nextLine());
        List<Story> storyUpdateList = storyController.findById(id);
        for (int i = 0; i < storyUpdateList.size(); i++) {
            System.out.println("| " + storyUpdateList.get(i).getId() + " |" + storyUpdateList.get(i).getName()+ " |");
        }
    }

    public void detailStories() {
        System.out.println("Enter ID Stories want to findddd ?");
        int id = Integer.parseInt(Config.scanner().nextLine());
        List<Story> storiesUpdateList = storiesController.findStoriesById(id);
        System.out.println(storiesUpdateList);
        for (int i = 0; i < storiesUpdateList.size(); i++) {
            System.out.println("| " + storiesUpdateList.get(i).getId() + " |" + storiesUpdateList.get(i).getName()+ " |");
        }
    }

    public void sortStory() {
        List<Story> storySort = storyController.sortStory();
        System.out.println("|STT|         NAME              ");
        for (int i = 0; i < storySort.size(); i++) {
            System.out.println("| " + storySort.get(i).getId()+ " |" + "      " + storySort.get(i).getName());
        }

    }

    public void sortStories() {
        List<Story> storiesList = storiesController.sortStories();
        System.out.println("|STT|         NAME              ");
        for (int i = 0; i < storiesList.size(); i++) {
            System.out.println("| " + storiesList.get(i).getId()+ " |" + "      " + storiesList.get(i).getName());
        }

    }


    private boolean isValid(int id) {
        int size = storyController.getStory().size();
        return id >= 0 && id < size;
    }
}

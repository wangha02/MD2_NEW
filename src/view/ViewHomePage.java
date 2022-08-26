package view;

import ViewStory.ViewCategoryStory;
import config.Config;
import controller.LikeController;
import controller.StoryController;
import controller.UserController;
import model.Like;
import model.RoleName;
import model.Story;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewHomePage {

    Scanner scanner = new Scanner(System.in);

    UserController userController = new UserController();

    LikeController likeController = new LikeController(); //

    StoryController storyController = new StoryController();//

    List<Like> likeList = likeController.getListLike(); //

    List<Story> storyList = storyController.getStory(); //

    User currentUser = userController.getCurrentUser();

    RoleName roleName = new ArrayList<>(currentUser.getRoles()).get(0).getRoleName(); // chấm gét 0 bởi vì chỉ có đúng 1 phần tử...là chỉ đăng nhập đc 1 tài khoản


    public ViewHomePage() {
        switch (roleName) {
            case ADMIN:
                menuAdmin();
                break;
            case USER:
                menuUser();
                break;
            default:
                break;
        }
    }

    public void menuUser() {
        System.out.println("Hello USER: " + currentUser.getName());
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ 1. Logout                  ║");
        System.out.println("║ 2. Category                ║");
        System.out.println("╚════════════════════════════╝");

        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                userController.logout();
                new ViewMainMenu().menu();
                break;
            // thêm các chức năng case
            case 2:
                new ViewCategoryStory().theLoai();
                break;
            case 3:
                formShowSongList();
                break;
        }
        menuUser();
    }


    public void menuAdmin() {
        System.out.println("Hello ADMIN: " + currentUser.getName());
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ 1. User Manager            ║");
        System.out.println("║ 2. Show song list          ║");
        System.out.println("║ 3. Log out                 ║");
        System.out.println("╚════════════════════════════╝");
        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                new ViewAdmin().adMin();
                break;
            case 2:
                formShowSongList();
                break;
            case 3:
                userController.logout();
                new ViewMainMenu().menu();
                break;
        }
        menuAdmin();
    }

    public void formShowSongList() {

        ///hiển thị story và lượt like
        for (Story story : storyList) {
            System.out.println(story + " Like: " + likeController.getLikeNumberById(story.getId()));
        }
        System.out.println("Enter story ID to show details");

        int idStory = Integer.parseInt(Config.scanner().nextLine());
        int likeNumber = likeController.getLikeNumberById(idStory);

        //hiển thị chi tiết story đã chọn
        System.out.println(storyController.findById(idStory));
        System.out.println("Like:" + likeNumber);

        //check xem currentUser đã like chưa?
        boolean checkLike = likeController.checkLike(idStory);
        System.out.println(checkLike ? "Đã Like" : "Like");

        //Nhập 1 để like or disLike, Nhập khác để thoát
        System.out.println("Enter 1 to like or else to back");
        int choice = Integer.parseInt(Config.scanner().nextLine());
//        System.out.println("Enter phu to like or else to back");
//        String choice = Config.scanner().nextLine();
//        if (choice.equalsIgnoreCase("phu")) {
        if (choice == 1) {
            if (checkLike) {
                //nếu đã like thì disLike
                likeController.deleteLike(idStory);
            } else {
                int idLike;
                if (likeList.isEmpty()) {
                    idLike = 1;
                } else {
                    idLike = likeList.get(likeList.size() - 1).getId() + 1;
                }
                likeController.createLike(new Like(idLike, idStory, currentUser.getId()));
            }
        }
    }
}
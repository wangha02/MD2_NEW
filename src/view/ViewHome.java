package view;

import config.Config;
import controller.UserController;
import model.RoleName;
//import model.Story;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewHome {

    Scanner scanner = new Scanner(System.in);

    UserController userController = new UserController();

    User currentUser = userController.getCurrentUser();

    RoleName roleName = new ArrayList<>(currentUser.getRoles()).get(0).getRoleName(); // chấm gét 0 bởi vì chỉ có đúng 1 phần tử...là chỉ đăng nhập đc 1 tài khoản


    public ViewHome() {
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
        System.out.println("+-----------------+");
        System.out.println("|1. LOG OUT       |");
        System.out.println("|2. THE LOAI      |");
        System.out.println("+-----------------+");


        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                userController.logout();
                new ViewMainMenu().menu();
                break;
            // thêm các chức năng case
            case 2:
                new ViewTheLoai().theLoai();
                break;


        }
//        menuUser();
    }


    public void menuAdmin() {
        System.out.println("Hello ADMIN: " + currentUser.getName());
        System.out.println("I.  USER MANAGER ");
        System.out.println("II. LOG OUT");

        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                formUserManager();
                break;
            case 2:
                userController.logout();
                new ViewMainMenu().menu();
                break;

        }
        menuAdmin();
    }

    public void formUserManager(){

    }
}














//        System.out.println("|----------CREATE STORY----------|");
//                while (true) {
//                int idStory;
//                if (storyList.size() == 0) {
//                idStory = 1;
//                }else {
//                idStory = storyList.get(storyList.size() - 1).getId()+1;
//                }
//
//                System.out.println("Enter Name Story: ");
//                String name = Config.scanner().nextLine();
//                Story story = new Story(name);
//                storyController.createStory(idStory,story);
//                System.out.println("Create success!");
//                storyController.showListStory();
//
//                System.out.println("Enter Quit Out ");
//                String backList = Config.scanner().nextLine();
//                if (backList.equalsIgnoreCase("quit")) {
//                new ViewHome();
//                break;
//                }
//                }
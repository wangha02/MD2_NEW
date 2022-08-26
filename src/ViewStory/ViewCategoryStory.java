package ViewStory;

import config.Config;
import controller.UserController;

import java.util.Scanner;

public class ViewCategoryStory {
    Scanner scanner = new Scanner(System.in);

    UserController userController = new UserController();

    public void theLoai() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║            CATEGORY        ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║ 1. Truyện cổ tích          ║");
        System.out.println("║ 2. Truyện Ngụ Ngôn         ║");
        System.out.println("╚════════════════════════════╝");
        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                new ViewFairyTale().FairyTale();
                break;
            case 2:
                new ViewFables().nguNgon();
                break;
        }
    }
}
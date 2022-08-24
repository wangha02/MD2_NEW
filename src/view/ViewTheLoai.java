package view;

import config.Config;
import controller.UserController;

import java.util.Scanner;

public class ViewTheLoai {
    Scanner scanner = new Scanner(System.in);

    UserController userController = new UserController();

    public void theLoai() {
        System.out.println("+-----------CATEGORY-----------+");
        System.out.println("|1. Co Tich                    |");
        System.out.println("|2. Co Ngu Ngon                |");
        System.out.println("+------------------------------+");
        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 1:
                new ViewTruyenCoTich().coTich();
                break;
            case 2:
                new ViewTruyenNguNgon().nguNgon();
                break;
        }
    }
}
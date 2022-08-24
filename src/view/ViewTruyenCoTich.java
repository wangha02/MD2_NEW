package view;

import config.Config;
public class ViewTruyenCoTich {

    public void coTich() {
        System.out.println("0. Back Out");
        System.out.println("1. Truyen Tam Cam");
        System.out.println("2. Cay Tre Tram Dot");
        System.out.println("3. So Dua");
        System.out.println("4. Co Be Ban Diem");
        System.out.println("5. Cay But Than");

        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 0:
                new ViewTheLoai().theLoai();
            case 1:
                break;

        }
    }
}
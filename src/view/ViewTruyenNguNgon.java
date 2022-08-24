package view;

import config.Config;

public class ViewTruyenNguNgon {

    public void nguNgon() {
        System.out.println("0. Back Out");
        System.out.println("1. Cao Va Qua ");
        System.out.println("2. Tho Va Rua ");
        System.out.println("3. Tho Va Chuot");
        System.out.println("4. Tho Va Cho Soi");

        int choice = Integer.parseInt(Config.scanner().nextLine());

        switch (choice) {
            case 0:
                new ViewTheLoai().theLoai();
            case 1:
                break;

        }
    }

}

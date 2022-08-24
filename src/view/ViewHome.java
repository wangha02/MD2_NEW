package view;

import controller.UserController;
import model.Role;
import model.RoleName;
import model.User;

import java.util.ArrayList;

public class ViewHome {
    UserController userController = new UserController();

    User currentUser = userController.getCurrentUser();

    RoleName roleName = new ArrayList<>(currentUser.getRoles()).get(0).getRoleName(); // chấm gét 0 bởi vì chỉ có đúng 1 phần tử...là chỉ đăng nhập đc 1 tài khoản
    public ViewHome() {
        System.out.println("HELLO" + roleName + " : " + currentUser.getName());
    }
}

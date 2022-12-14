package service.user;

import config.Config;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceIMPL implements IUserService {
    static String PATH_USER = "src/database/user.txt";
    static String PATH_USER_LOGIN = "src/database/user_login.txt";
    static Config<List<User>> config = new Config<>();

    static List<User> userList = config.read(PATH_USER);

    static {
        if (userList == null) {
            userList = new ArrayList<>();
        }
    }


    @Override
    public List<User> findAll() {
        config.write(PATH_USER, userList);
        return userList;
    }

    @Override
    public void save(User user) {
        userList.add(user);
        updateData();
    }

    @Override
    public void remove(int id) {
        userList.remove(findById(id));
        config.write(PATH_USER, userList);
        updateData();

    }

    @Override
    public User findById(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void updateData() {
        config.write(PATH_USER, userList);

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public boolean existsByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existsByEmail(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkLogin(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public User getCurrentUser() {
        User user = new Config<User>().read(PATH_USER_LOGIN); //ch??? tr??? v??? l?? 1 user.user trong file txt...t??m user list ????? tr??? v???
        if (user == null)
            return null;
        return findByUsername(user.getUsername()); // l???y username c???a n??
    }

    @Override
    public void saveCurrentUser(User user) {
        new Config<User>().write(PATH_USER_LOGIN, user);

    }

    @Override
    public User findByUsername(String username) {
        for (User user : userList) {  //userList: ch???a t???t c???
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}


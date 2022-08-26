package service;

import model.Story;

import java.util.List;

public interface IGenericService<T> {

    List<T> findAll();

    void save(T t);

    //CRUD
    void remove(int id);

    T findById(int id);

    void updateData();

    void deleteById(int id);


//    boolean existsByUsername(String username);
//
//    boolean existsByEmail(String email);
//
//    boolean checkLogin(String username, String password);
//
//    User getCurrentUser();
//
//    void saveCurrentUser(User user);
//
//    User findByUsername(String username);

}

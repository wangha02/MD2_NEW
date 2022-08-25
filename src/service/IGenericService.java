package service;

import model.Story;

import java.util.List;

public interface IGenericService<T> {

    List<T> findAll();

    List<Story> save(T t);

    //CRUD
    void remove(int id);

    T findById(int id);

    void updateData();

    void deleteById(int id);



}

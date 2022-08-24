package service;

import java.util.List;

public interface IGenericService<T> {

    List<T> findAll();

    void save(T t);

}

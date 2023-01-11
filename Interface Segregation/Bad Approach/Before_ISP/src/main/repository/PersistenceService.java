package repository;

import entity.Entity;

import java.util.List;


//Common interface for all persistence layer class to implement
public interface PersistenceService<T extends Entity> {
    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);


    //this method only makes sense for User entity  but not for Order entity
    //since i have added this method here, all classes that implemnts this interface will be forced
    //to provide the implementation
    public List<T> findByName(String name);
}

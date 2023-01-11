package repository;

import entity.Entity;

//Lets remove the unrelated methods from here
public interface PersistenceService<T extends Entity> {

    public void save(T entity);

    public void delete(T entity);

    public T findById(Long id);

    //////////////////////////////////////////////////////////////////////////////////////

    //Only way to fix this is to creat a separate interface and remove this from here
    //or if no of methods are less(as in this example ) make your UserPersistnce define this method by itself
    //Lets Remove this method from here

    //public List<T> findByName(String name);
}

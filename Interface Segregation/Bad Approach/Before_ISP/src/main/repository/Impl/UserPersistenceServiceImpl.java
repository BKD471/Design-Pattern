package repository.Impl;

import entity.User;
import repository.PersistenceService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//This is  Dao class for User Entity ,Responsible to interact with Db for any User Entity operations
public class UserPersistenceServiceImpl implements PersistenceService<User> {

    // Let's assume the hashmap USERS be a dummy Database
    private static final Map<Long, User> USERS = new HashMap<>();

    //This all are different DB operation that can be performed for User entity
    //Saving a user to db
    @Override
    public void save(User entity) {
      synchronized (USERS){
          USERS.put(entity.getId(),entity);
      }
    }

    //deleting a user by id from db
    @Override
    public void delete(User entity) {
        synchronized (USERS){
            USERS.remove(entity.getId());
        }
    }

    //fetching a user from db by id
    @Override
    public User findById(Long id) {
        return USERS.get(id);
    }

    //find list of all users whose name matches the passed name as argument
    @Override
    public List findByName(String name) {
        synchronized (USERS){
           return USERS.values().stream().filter(user->user.getName().equals(name)).collect(Collectors.toList());
        }
    }
}

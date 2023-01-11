package repository.Impl;

import entity.Order;
import repository.PersistenceService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This is a  DAO class of Order, to perform all DB operation for Order entity
public class OrderPersistenceServiceImpl implements PersistenceService<Order> {

    // Let's assume the hashmap ORDERS be a dummy Database
    private static final Map<Long, Order> ORDERS = new HashMap<>();

    //Saving an order to db
    @Override
    public void save(Order entity) {
        synchronized (ORDERS){
           ORDERS.put(entity.getId(),entity);
        }
    }

    //deleting an order by id from DB
    @Override
    public void delete(Order entity) {
       synchronized (ORDERS){
           ORDERS.remove(entity.getId());
       }
    }

    //fetching an order by id from db
    @Override
    public Order findById(Long id) {
        synchronized (ORDERS){
           return ORDERS.get(id);
        }
    }

    //HERE COMES THE MAIN PROBLEM
    //this findByName(String name) method was suitable for User entity but not for Order
    // because we had an instance field name in User class but not in Order
    //so this method is not suitable for OrderPersistenceService
    // but this class is forced to provide a dummy implementation because
    //findByName method is declared in common interface PersistenceService that both both of these classes are implemnting
    @Override
    public List<Order> findByName(String name) {
        throw  new UnsupportedOperationException("This method is not suitable for Order Entity");
    }
}

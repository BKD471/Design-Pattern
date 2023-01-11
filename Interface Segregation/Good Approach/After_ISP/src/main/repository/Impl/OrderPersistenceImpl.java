package repository.Impl;

import entity.Order;
import repository.PersistenceService;

import java.util.HashMap;
import java.util.Map;

//This is a  DAO class of Order, to perform all DB operation for Order entity
public class OrderPersistenceImpl implements PersistenceService<Order> {
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

    //we are no longer forced to override findByName method ,provide dummy implementation in OrderPersistenceServiceIMpl

}

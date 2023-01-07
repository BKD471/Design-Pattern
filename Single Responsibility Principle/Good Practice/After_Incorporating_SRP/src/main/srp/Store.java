package srp;

import java.util.Map;
import java.util.HashMap;

//This component stores the user object in Database upon successful completion of validating user details
public class Store {
    private static final Map<String ,User> db=new HashMap<String,User>();

    public final void store(User user){
        synchronized (db){
            db.put(user.getName(),user);
        }
    }

    public final User getUser(String name){
        synchronized (db){
            return db.get(name);
        }
    }
}

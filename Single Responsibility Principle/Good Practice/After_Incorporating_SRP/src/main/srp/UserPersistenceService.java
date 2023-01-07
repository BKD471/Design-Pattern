package srp;

import java.util.Objects;

//This component is responsible for Storing the User on Database upon successful validation
public class UserPersistenceService {
    Store store=new Store();

    public  void save(User user){
        store.store(user);
        getUserInfo(store, user);
    }

    private void getUserInfo(Store store, User user) {
        User fetcheduser = store.getUser(user.getName());
        if (!Objects.isNull(fetcheduser))
            System.out.println(String.format("Address of %s is %s,email %s", user.getName(),
                    user.getAddress(), user.getEmail()));
    }

}

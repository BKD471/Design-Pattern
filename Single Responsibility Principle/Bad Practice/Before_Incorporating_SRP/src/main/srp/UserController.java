package srp;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//This component UserController handles incoming JSON request that creates User


// Why this a Bad Approach and breaks the SRP(Single Responsibilty Principle)???
//A Controller component is supposed to handle incoming request from client
// and handover the request to other components for processing,
// It should not contain any business logic  and  persistence logic
public class UserController {
    private Store store = new Store();

    public String createUser(String userJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        //Deseralize json content into java object
        User user = mapper.readValue(userJson, User.class);

        //Here it checks whether user is valid or not
        //this type of logic should be done in service layer of APp and not in controller
        //If our validation logic changes or if we add a new param to User,this class needs to change
        //and this is bad :)
        if (!isValidUser(user)) {
            invalidUser(user);
            return "ERROR";
        }

        //Here it stores the user to database,
        //this type of logic should be present in Repository layer or Persistence Layer and not here
        //Suppose we  are changing database from mysql to mongodb
        //then new business requirement  will force this class to change
        store.store(user);

        getUserInfo(store, user);
        return "SUCCESS";
    }

    private void invalidUser(User user) {
        if (!Objects.isNull(user))
            System.out.println(String.format("The JSON corresponding to user %s is Invalid", user.getName()));
    }

    private void getUserInfo(Store store, User user) {
        User fetcheduser = store.getUser(user.getName());
        if (!Objects.isNull(fetcheduser))
            System.out.println(String.format("Address of %s is %s,email %s", user.getName(),
                    user.getAddress(), user.getEmail()));
    }

    private boolean isValidUser(User user) {
        if (!isPresent(user.getName())) return false;
        user.setName(user.getName().trim());

        if (!isValidAlphaNumeric(user.getName())) return false;
        if (Objects.isNull(user.getEmail()) || user.getEmail().trim().length() == 0) return false;

        user.setEmail(user.getEmail());
        if (!isValidEmail(user.getEmail())) return false;

        return true;
    }

    private boolean isPresent(String value) {
        return !Objects.isNull(value) && value.trim().length() > 0;
    }

    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }

    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }
}

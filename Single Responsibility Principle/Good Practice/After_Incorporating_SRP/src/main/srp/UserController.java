package srp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Objects;

public class UserController {
    private UserPersistenceService ups=new UserPersistenceService();

    public String createUser(String userJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        //Deseralize json content into java object
        User user = mapper.readValue(userJson, User.class);

        //Create an instance to validate user
        UserValidation userValidation=new UserValidation();

        //Behavoirs for validating user is delegated to a differnt class UserValidation
        if (!userValidation.validateUser(user)) {
            return "ERROR";
        }
        //Logic to save the user to db is delegated to differe class UserPersistenceService
        ups.save(user);

        return "SUCCESS";
    }

}

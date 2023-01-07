package srp;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//This component is responsible for validating user
public class UserValidation {

    public boolean validateUser(User user) {
        if(!isValidUser(user)) {
            invalidUser(user);
            return false;
        }
        return true;
    }

    public  void invalidUser(User user){
        if(!Objects.isNull(user)) System.out.println(String.format("Encountered Error while parsing the JSOn request for User with name %s",user.getName()));
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

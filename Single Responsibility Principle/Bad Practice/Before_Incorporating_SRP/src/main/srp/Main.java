package srp;

import java.io.IOException;
public class Main {
    private static final String VALID_USER_JSON = "{\"name\": \"Ironman\", \"email\": \"Iron@email.com\", " +
            "\"address\":\"Stark Mansion\"}";

    //Invalid USER JSON String - email format wrong--> .com is not there
    private static final String INVALID_USER_JSON = "{\"name\": \"Thor\", \"email\": \"thor@email\", " +
            "\"address\":\"Asgard\"}";

    public static void main(String[] args) throws  IOException {
        UserController user = new UserController();
        String response = user.createUser(VALID_USER_JSON);

        if (!response.equalsIgnoreCase("SUCCESS")) System.out.println("INVALID JSON RESPONSE RECEIVED " + response);

        response=user.createUser(INVALID_USER_JSON);
        if (!response.equalsIgnoreCase("SUCCESS")) System.out.println("INVALID JSON RESPONSE RECEIVED " + response);

    }
}

package dic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


//Class to format into JSON
public class JSONFormatter {
    public String format(Message message) throws FormatException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new FormatException(e);
        }
    }
}

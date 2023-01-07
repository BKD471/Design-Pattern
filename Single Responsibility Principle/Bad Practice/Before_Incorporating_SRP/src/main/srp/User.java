package srp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//User POJO class
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  String name;
    private String email;
    private String address;
}

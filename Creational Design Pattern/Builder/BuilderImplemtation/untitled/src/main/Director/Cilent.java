package Director;

import dto.UserDto;
import dto.UserDtoBuilder;
import dto.impl.UserWebDtobuilder;
import entity.Address;
import entity.User;

import java.time.LocalDate;

//this component holds the controlling logic for Builder pattern
public class Cilent {
    public static void main(String[] args) {
        User user = createUser();
        UserDtoBuilder builder = new UserWebDtobuilder();
        UserDto dto = directBuild(builder, user);
        System.out.println(dto);
    }

    private static UserDto directBuild(UserDtoBuilder builder, User user) {
        //this is what we call method chaining
        //remember we define the return type of methods in UserDtoBuilder interface as its type
        //so that we cane chain all of them
        //Crazy genius right?
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1997, 12, 01));
        user.setFirstName("Bhaskar");
        user.setLastName("Kumar Das");
        Address address = new Address();
        address.setHouseNumber("47");
        address.setStreet("Texas");
        address.setCity("Chandernagore");
        address.setState("Las Vegas");
        address.setZipcode("71236");
        user.setAddress(address);
        return user;
    }
}

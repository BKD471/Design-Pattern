package director;

import dto.UserDto;
import entity.User;
import  entity.Address;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        // director.Client has to provide director with concrete builder
        //get the instance of UserDtoBuilder
        UserDto.UserDTOBuilder getTheBuilder=UserDto.getBuilder();

        //ccall directbuild
        UserDto dto = directBuild(getTheBuilder, user);
        System.out.println(dto);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDto directBuild(UserDto.UserDTOBuilder builder, User user) {

        //method chaining helps us to building up the object one by one
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1997, 12, 01));
        user.setFirstName("Bhaskar");
        user.setLastName("Das");
        Address address = new Address();
        address.setHouseNumber("47");
        address.setStreet("Strand Road");
        address.setCity("Chandernagore");
        address.setState("Texas");
        address.setZipcode("712136");
        user.setAddress(address);
        return user;
    }

}

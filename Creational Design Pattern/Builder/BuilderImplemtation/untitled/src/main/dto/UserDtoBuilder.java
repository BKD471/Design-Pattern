package dto;

import entity.Address;

import java.time.LocalDate;


//this interface contains all methods needed to build Parts of
//end product UserWebDto one by one
public interface UserDtoBuilder {

    //Point to note...all of these methods return
    //reference to itself. this is one to acheive method chaining
    //go to directBuild() of Client to see how its done
    UserDtoBuilder withFirstName(String fname) ;

    UserDtoBuilder withLastName(String lname);

    UserDtoBuilder withBirthday(LocalDate date);

    UserDtoBuilder withAddress(Address address);
    //method to "assemble" final product
    UserDto build();
    // method to fetch already built object
    UserDto getUserDTO();
}

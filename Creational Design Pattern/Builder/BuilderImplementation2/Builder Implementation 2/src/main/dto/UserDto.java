package dto;



import entity.Address;

import java.time.LocalDate;
import java.time.Period;


//this is the final Product
//that we want to built

//unlike the first appraoch we are not using any constructor
//but still making an immutable instance of this class
public class UserDto {
    private String name;

    private String address;

    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    //look carefully, the setters are all private
    //so we cant set them from outside
   //Instead use build() of inner class UserDtoBuilder
    //being inner class it has got access to the private setters of its outer UserDto
    //this is  GOD level  SWAG :)
    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }


    //Get builder instance
    //make it static, we need to have the instance of UserDtoBuilder to set through setters.
    //build the object and get the final state
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }
    //Builder
    public static class UserDTOBuilder {

        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private UserDto userDTO;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + " " +address.getStreet()
                    + "\n"+address.getCity()+", "+address.getState()+" "+address.getZipcode();

            return this;
        }

        //building the object
        // here the magic is happening
        //setting up the private setters of outer class UserDto
        public UserDto build() {
            this.userDTO = new UserDto();
            userDTO.setName(firstName+" " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return this.userDTO;
        }

        //getting the final obj
        public UserDto getUserDTO() {
            return this.userDTO;
        }
    }
}

package dto.impl;

import dto.UserDto;
import dto.UserDtoBuilder;
import entity.Address;

import java.time.LocalDate;
import java.time.Period;

//this is a concrete class for UserDtoBuilder
public class UserWebDtobuilder implements  UserDtoBuilder{


    //if you look closely UserWebDto needs whole name and
    //not first name or last name,so we will build
    //full name out of first name and last name
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDto dto;

    @Override
    public UserDtoBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDtoBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }


    //The final Product we need is User's age and not birthDate
    //so what we can do is to build his age from his birthDate
    @Override
    public UserDtoBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() +", " + address.getStreet()
                +"\n" + address.getCity() +"\n"+address.getState()+" "+address.getZipcode();
        return this;
    }

    @Override
    public UserDto build() {
        dto = new UserWebDto(firstName+ " "+lastName, address, age);
        return dto;
    }

    @Override
    public UserDto getUserDTO() {
        return dto;
    }
}

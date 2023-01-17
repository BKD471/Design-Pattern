package dto.impl;

import dto.UserDto;

//This is the final Product
//that we want to create in through builder pattern
public class UserWebDto implements UserDto {
    private String name;

    private String address;

    private String age;

    //To create the obj of UserWebDto
    //1) we need name of user
    //2)address of user
    //3)age of user
    public UserWebDto(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }
}

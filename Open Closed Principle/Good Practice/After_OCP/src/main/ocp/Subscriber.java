package ocp;

import lombok.Data;

@Data
//Base Class Closed for modification
//Since there exists No subscriber without being either PhoneSubscriber/ Isp/Volte subscriber
//So its good to make Subscriber class abstract ,as Subscriber doesnot exist on its own
public abstract class Subscriber {
    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;
    protected int baseRate;

    public abstract double calculateBill();// abstract method open for extension in child class
}

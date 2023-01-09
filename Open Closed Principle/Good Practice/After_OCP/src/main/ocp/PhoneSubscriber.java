package ocp;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

//Child class is open for extension
@Data
public class PhoneSubscriber extends  Subscriber{


    //Its Good
    //All duplicated Instance Fields like subscriberId, address, phoneNumber baseRate
    // are now in base class Subscriber from which we are extending and reusing

    //We provide new behaviour to base class abstract method calculateBill
    //by overriding it in child class PhoneSubscriber
    //Parent class calculateBill method is left untouched
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration * baseRate / 100;
    }
}

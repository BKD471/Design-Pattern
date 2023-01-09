package ocp;

import lombok.Data;

import java.util.List;


//Child class is open for extension
@Data
public class IspSubscriber extends  Subscriber{

    //Its Good
    //All duplicated Instance Fields like subscriberId, address, phoneNumber baseRate
    // are now in base class Subscriber from which we are extending and reusing
    private long freeUsage;


    //We provide new behaviour to base class abstract method calculateBill by Overriding it in
    //Child class IspSubScriber
    //Parent class calculateBill method is left untouched
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }
}

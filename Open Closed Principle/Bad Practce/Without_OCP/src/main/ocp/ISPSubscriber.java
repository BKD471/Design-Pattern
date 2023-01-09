package ocp;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ISPSubscriber {
    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;

    //Its bad
    //Instance Fields like subscriberId, address, phoneNumber baseRate
    // are common to both Phone Subscriber and ISP Subscriber,
    // this is code redundancy , what if we create another VolteSuscriber or VoipSubscriber
    //they will again need these instance fields
    //Why not delegating these Instance field to a separate Base class from which we can reuse
    private long freeUsage;


    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }
}

package ocp;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PhoneSubscriber {

    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;

    //Its bad
    //Instance Fields like subscriberId, address, phoneNumber baseRate
    // are common to both Phone Subscriber and ISP Subscriber,
    // this is code redundancy, what if we create another VolteSubscriber or VoipSubscriber
    //they will again need these instance fields
    //Why not delegating these Instance field to a separate Base class from which we can reuse

    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration * baseRate / 100;
    }

}

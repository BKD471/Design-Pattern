package dic;

public class TextFormatter implements Formatter{

    public String format(Message message){
        return message.getTimestamp()+":"+message.getMsg();
    }
}

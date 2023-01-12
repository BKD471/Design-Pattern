package dic;

//formats msg to plain text
public class TextFormatter {
    public String format(Message message){
        return message.getTimestamp()+":"+message.getMsg();
    }
}

package dic;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

    //Writes message to a file

    //we are now passing the interface type instead of creating any concrete implemntation in our class
   //be it an instance of JSONFormatter or TextFormatter, MessagePrinter simply doesnot care
    // so no more tight coupling :)
    public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {

        writer.println(formatter.format(msg)); //formats and writes message
        writer.flush();
    }
}

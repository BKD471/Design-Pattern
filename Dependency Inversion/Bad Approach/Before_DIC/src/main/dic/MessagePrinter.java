package dic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class MessagePrinter {
    //Writes message to a file
    public void writeMessage(Message msg, String fileName) throws IOException {

        //this is very bad, it creates tight coupling between MessagePrinter to JSONFormatter
        //Its bad because of two reasons
        //1)suppose there is any major code change in JSONForammter class,it will surely impact Message Printer

        //Formatter can be of any type be it TextFormatter/ JSONFormatter
        //suppose we want to use TextFormatter here in future instead of JSONFormatter
        //this code will be needed to change
        //so why not creating a common interface for both JSON/Text formatter and pass the  parent refrence type
        JSONFormatter formatter = new JSONFormatter();//creates formatter
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer
            writer.println(formatter.format(msg)); //formats and writes message
            writer.flush();
        }
    }
}

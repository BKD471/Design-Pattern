package dic;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
        try(PrintWriter writer = new PrintWriter(System.out)) {

            // here we are passing  instance of JSONFormatter
            // if we want we can pass TextFormatter also
            //MessagePrinter now no longer depends on the type of obj passed because we
            //are using the common interface type i.e Foramtter
            printer.writeMessage(msg, new JSONFormatter(), writer);
            printer.writeMessage(msg, new TextFormatter(), writer);
        }
    }

}
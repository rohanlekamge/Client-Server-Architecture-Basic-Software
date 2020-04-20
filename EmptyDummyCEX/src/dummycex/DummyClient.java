/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummycex;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gab
 */
public class DummyClient {

    DummyServer server = new DummyServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DummyClient client = new DummyClient();
        client.execute();
    }

    private void execute() {

        System.out.println("[CLIENT] - Starting test...");
        /*
        Connection Test (30)
         */
        System.out.println("[CLIENT] - Checking if server is connected...");
        if (server.isConnected() == 1) {
            System.out.println("[CLIENT] - Server is connected, test can proceed");
            /*
            Simple method without exception (40)
             */
            Double x1 = 1.0;
            Double x2 = 1.1;
            if (server.getMaximumBetween(x1, x2) == x2) {
                System.out.println("[CLIENT] - Server returned the correct result");
            }

            /*
            Simple method with exception (49)
             */
            try {
                if (server.getMaximumBetweenWithException(x1, x2) == x2) {
                    System.out.println("[CLIENT] - Server returned the correct result");
                }
                if (server.getMaximumBetweenWithException(null, x2) == x2) {
                    System.out.println("[CLIENT] - Server returned the correct result");
                }
            } catch (Exception ex) {
                Logger.getLogger(DummyClient.class.getName()).log(Level.SEVERE, null, ex);
            }

            /*
            Related Methods without exception
             */
            server.addValue(1);
            server.addValue(2);
            server.addValue(3);
            server.addValue(4);
            System.out.println("[CLIENT] - the minimum value is: " + server.getMinumumValue());

            /*
            User Defined Types
             */
            Message m1 = new Message();
            m1.setAuthor("Jasmine");
            m1.setContent("Good morning");
            System.out.println("[CLIENT] - The length of 'Good Morning' is " + server.getMessageContentLength(m1));

            /*
            Mistery Question
             */
            Message m2 = new Message();
            m2.setAuthor("Gab");
            m2.setContent("Hello");
            server.addMessage(m2);

            Message m3 = new Message();
            m3.setAuthor("Julia");
            m3.setContent("Hello Gab");
            server.addMessage(m3);

            Message m4 = new Message();
            m4.setAuthor("Gab");
            m4.setContent("How do you do ?");
            server.addMessage(m4);

            Message m5 = new Message();
            m5.setAuthor("Julia");
            m5.setContent("Weel, thank you, How do you do ?");
            server.addMessage(m5);

            Message m6 = new Message();
            m6.setAuthor("Julia");
            m6.setContent("Weel, thank you, How do you do ?");
            server.addMessage(m6);

            System.out.println("[CLIENT] - All messages posted by Gab are " + server.getAllMessagesBy("Gab"));
        } else {
            System.out.println("[CLIENT] - Server is NOT connected, test aborted");
        }
        System.out.println("[CLIENT] - Test completed !");

    }
}

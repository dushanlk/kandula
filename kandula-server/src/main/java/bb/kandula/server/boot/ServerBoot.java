package bb.kandula.server.boot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerBoot {

    public static void main(String[] args) throws Exception {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook();

        //TODO add snmp messages. Ref. SblStarter
        logStartupMessage();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                logStoppedMessage();
            }
        });

        context.start();
        Thread.currentThread().join();
    }

    private static void logStartupMessage() {
        System.out.println("------------------------------------------------------------");
        System.out.println("|                  KANDULA SERVER STARTED                  |");
        System.out.println("------------------------------------------------------------");
    }

    private static void logStoppedMessage() {
        System.out.println("------------------------------------------------------------");
        System.out.println("|                  KANDULA SERVER STOPPED                  |");
        System.out.println("------------------------------------------------------------");
    }
}

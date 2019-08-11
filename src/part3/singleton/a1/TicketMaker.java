package part3.singleton.a1;

public class TicketMaker {

    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("Generated new instance.");
    }

    private int ticket = 1000;

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }
}

package part3.singleton.a1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        TicketMaker ticketMaker = TicketMaker.getInstance();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }

        System.out.println("End.");
    }
}

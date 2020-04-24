package ro.siit;

public class FestivalAttendeeThread extends Thread {
    private TicketType ticketType;
    private FestivalGate gate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    public void run(){
        try {
            Thread.sleep(3000);
            gate.addTicket(ticketType);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package ro.siit;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        FestivalGate gate = new FestivalGate();
        FestivalAttendeeThread[] threads = new FestivalAttendeeThread[50000];

        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);
        statsThread.start();

        for(int i=0; i<threads.length; i++){
            TicketType ticketType = TicketType.randomTicketType();
            //System.out.println("tipe: " + ticketType);
            threads[i] = new FestivalAttendeeThread(ticketType, gate);
            threads[i].start();
        }

        for(int i=0; i<threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(gate.getTotalEntries() + " people entered");
//        System.out.println(gate.countFULLTickets() + " people have full tickets");
//        System.out.println(gate.countFREE_PASSTickets() + " have free passes");
//        System.out.println(gate.countFULL_VIPTickets() + " have full VIP passes");
//        System.out.println(gate.countONE_DAYTickets() + " have one-day passes");
//        System.out.println(gate.countONE_DAY_VIPTickets() + " have one-day-VIP passes");

    }
}

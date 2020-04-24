package ro.siit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FestivalGate {
    private Queue<TicketType> listTickets= new LinkedList<>();

    public synchronized void addTicket(TicketType ticketType){
        this.listTickets.add(ticketType);
    }

    public synchronized int getTotalEntries(){
        return listTickets.size();
    }

    public synchronized int countFULLTickets(){
        int count = 0;
        for(TicketType ticketType:listTickets){
            if(ticketType.equals(TicketType.FULL)){
                count ++;
            }
        }
        return count;
    }

    public synchronized int countFULL_VIPTickets(){
        int count = 0;
        for(TicketType ticketType:listTickets){
            if(ticketType.equals(TicketType.FULL_VIP)){
                count ++;
            }
        }
        return count;
    }

    public synchronized int countFREE_PASSTickets(){
        int count = 0;
        for(TicketType ticketType:listTickets){
            if(ticketType.equals(TicketType.FREE_PASS)){
                count ++;
            }
        }
        return count;
    }

    public synchronized int countONE_DAYTickets(){
        int count = 0;
        for(TicketType ticketType:listTickets){
            if(ticketType.equals(TicketType.ONE_DAY)){
                count ++;
            }
        }
        return count;
    }

    public synchronized int countONE_DAY_VIPTickets(){
        int count = 0;
        for(TicketType ticketType:listTickets){
            if(ticketType.equals(TicketType.ONE_DAY_VIP)){
                count ++;
            }
        }
        return count;
    }

}

package ro.siit;

import java.sql.SQLOutput;

public class FestivalStatisticsThread extends Thread {

    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate){
        this.gate = gate;
        this.setDaemon(true);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
                this.afisare();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void afisare(){
        System.out.println(gate.getTotalEntries() + " people entered");
        System.out.println(gate.countFULLTickets() + " people have full tickets");
        System.out.println(gate.countFREE_PASSTickets() + " have free passes");
        System.out.println(gate.countFULL_VIPTickets() + " have full VIP passes");
        System.out.println(gate.countONE_DAYTickets() + " have one-day passes");
        System.out.println(gate.countONE_DAY_VIPTickets() + " have one-day-VIP passes");
        System.out.println("..............................");
    }

}

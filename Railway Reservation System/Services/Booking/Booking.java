package Services.Booking;

import java.util.*;

public class Booking {
    public int tick_id;
    public String name;
    public int nof_tick;
    public String source;
    public String destination;
    public String status;
    Random rand = new Random();
    public Booking() {
        System.out.println("Booking class object is created");
    }

    public Booking(String name, int nof_tick, String source, String destination, String status) {
        this.tick_id=rand.nextInt();
        this.name = name;
        this.nof_tick = nof_tick;
        this.source = source;
        this.destination = destination;
        this.status = status;
    }

    public static int calculateseats(ArrayList<Booking> seats) {
        int c = 0;
        for (Booking i : seats) {
            c += i.nof_tick;
        }
        return c;
    }

}

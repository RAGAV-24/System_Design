package Services.Prepare_Chart;

import Services.Booking.Booking;
import java.util.ArrayList;
import java.util.HashMap;

public class Chart {

    public Chart() {
        System.out.println("Chart object is created succesfully");
    }

    public void display(HashMap<String, ArrayList<Booking>> seats) {
        System.out.println("Types of seats offered by us ");
        for (String key : seats.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println("Seats");
        int acco = 0, naco = 0, seco = 0;
        System.out.println("Type 1-> AC");
        System.out.println("s_no name nof_tick source destination status");
        int i = 1;
        for (Booking l : seats.get("AC")) {
            System.out.println((i++) + " "+l.tick_id+" " + l.name + " " + l.nof_tick + " " + l.source + " " + l.destination + " " + l.status);
            acco += l.nof_tick;
        }
        System.out.println("Total Seats:" + acco);
        System.out.println("Type 2-> Non-AC");
        System.out.println("s_no name nof_tick source destination status");
        i = 1;
        for (Booking l : seats.get("Non-AC")) {
            System.out.println((i++) + " "+l.tick_id+" " + l.name + " " + l.nof_tick + " " + l.source + " " + l.destination + " " + l.status);
            naco += l.nof_tick;
        }
        System.out.println("Total Seats:" + naco);
        System.out.println("Type 3-> Seater");
        System.out.println("s_no name nof_tick source destination status");
        i = 1;
        for (Booking l : seats.get("Seater")) {
            System.out.println((i++) + " "+l.tick_id+" "  + l.name + " " + l.nof_tick + " " + l.source + " " + l.destination + " " + l.status);
            seco += l.nof_tick;
        }
        System.out.println("Total Seats:" + seco);
    }
}

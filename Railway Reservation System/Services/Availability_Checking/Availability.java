// package Availability_Checking;
package Services.Availability_Checking;

import Services.Booking.Booking;
import java.util.*;

public class Availability {

    public Availability() {
        System.out.println("Availability object is created");
    }

    public void check(ArrayList<Booking> seats, String seat_type) {
        int count = 0;
        int wait = 0;
        for (Booking l : seats) {
            if (l.status.equals("booked")) {
                count += l.nof_tick;
            }
            if (l.status.equals("waiting_list")) {
                wait += l.nof_tick;
            }
        }
        if (count <= 60) {
            System.out.println("The number of seats already booked in " + seat_type + " seat type are" + count);
            System.out.println("The number of seats available in " + seat_type + " seat type are" + (60 - count));
        }
        if (wait > 0) {
            System.out.println("The number of peoples already  in " + seat_type + " seat type Waiting list  are" + wait);
            System.out.println("The number of peoples still can be in " + seat_type + " seat type Waiting list  are" + (10 - wait));

        }
        if (count == 60 && wait == 10) {
            System.out.println("There no seats to book");
            return;
        }
        System.out.println("The booking Informations are as follows");
        System.out.println("name nof_tick source destination status");
        for (Booking l : seats) {
            System.out.println(l.name + " " + l.nof_tick + " " + l.source + " " + l.destination + " " + l.status);
        }
    }

}

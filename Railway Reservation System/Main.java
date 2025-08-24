
import Availability_Checking.*;
import Booking.*;
import Cancellation.*;
import Prepare_Chart.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<Booking>> seats = new HashMap<>();
        System.out.println("Enter your choice ");
        System.out.println("1->Availability_Checking 2->Booking 3->Cancellation 4->Prepare chart ");
        int choice = sc.nextInt();
        while (choice < 5) {
            if (choice == 1) {
                Availability ao = new Availability();

            } else if (choice == 2) {
                Booking bo = new Booking();
                System.out.println("Enter your choice for the type of seat 1->AC Coach 2->Non-AC Coach 3->Seater");
                int seat_type = sc.nextInt();
                System.out.println((seat_type > 3) ? "Invalid choice Enter a valid choice" : " ");
                String seatString = (seat_type == 1) ? "AC" : ((seat_type == 2) ? "Non-AC" : "Seater");
                int noseats_booked = (seats.containsKey(seatString) ? (bo.calculateseats(seats.get(seatString))) : 0);
                if (noseats_booked >= 70) {
                    System.out.println("There is no enough seats in " + seatString);
                    break;
                }
                System.out.println("There is only " + (70 - noseats_booked) + "available");
                System.out.println("Enter your name ,number of tickects ,souce and destination location  give space inbetween each");
                String name = sc.next();
                int nof_tick = sc.nextInt();
                String source = sc.next();
                String destination = sc.next();
                if (seats.containsKey(seatString)) {
                    seats.get(seatString).add(new Booking(name, nof_tick, source, destination));
                } else {
                    seats.put(seatString, new ArrayList<>());
                    seats.get(seatString).add(new Booking(name, nof_tick, source, destination));
                }

                System.out.println("Seat is booked succesfully with this user name");
                System.out.println("Happy journey");
            } else if (choice == 3) {
                Cancellation co = new Cancellation();

            } else if (choice == 4) {
                Chart co = new Chart();
            }
            System.out.println("Enter your choice ");
            choice = sc.nextInt();

        }
    }
}

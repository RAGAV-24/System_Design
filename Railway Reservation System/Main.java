
import Services.Availability_Checking.*;
import Services.Booking.*;
import Services.Cancellation.*;
import Services.Prepare_Chart.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<Booking>> seats = new HashMap<>();
        seats.put("AC", new ArrayList<>());
        seats.put("Non-AC", new ArrayList<>());
        seats.put("Seater", new ArrayList<>());
        System.out.println("Enter your choice ");
        System.out.println("1->Availability_Checking 2->Booking 3->Cancellation 4->Prepare_chart 5->Exit");
        int choice = sc.nextInt();
        while (choice < 5) {
            if (choice == 1) {
                Availability ao = new Availability();
                System.out.println("Enter the type of seat you want to checkout AC,Non-AC ,Seater");
                String searchString = sc.next();
                ao.check(seats.get(searchString), searchString);
                System.out.println("Availability checking is done prefectly");

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
                System.out.println("There is only " + (60 - noseats_booked) + "available");
                boolean waiting_list = false;
                if ((60 - noseats_booked) == 0) {
                    System.out.println("would you like to enter into the waiting list \n 1->yes 2->no");
                    int wa = sc.nextInt();
                    waiting_list = (wa == 1) ? true : false;
                }
                System.out.println("Enter your name ,number of tickects ,souce and destination location  give space inbetween each");
                String name = sc.next();
                int nof_tick = sc.nextInt();
                String source = sc.next();
                String destination = sc.next();
                if (waiting_list) {
                    seats.get(seatString).add(new Booking(name, nof_tick, source, destination, "waiting_list"));
                } else {
                    // seats.put(seatString, new ArrayList<>());
                    seats.get(seatString).add(new Booking(name, nof_tick, source, destination, "booked"));
                }

                System.out.println("Seat is booked succesfully with this user name");
                System.out.println("Happy journey");
            } else if (choice == 3) {
                Cancellation co = new Cancellation();
                System.out.println("Please enter your name source and destination sperated by space");
                String name=sc.next();
                String source=sc.next();
                String destination=sc.next();

                co.cancel(seats,name,source,destination);

            } else if (choice == 4) {
                Chart co = new Chart();
                co.display(seats);
                System.out.println("Chart is displayed successfully");
            }
           System.out.println("1->Availability_Checking 2->Booking 3->Cancellation 4->Prepare_chart 5->Exit");

            System.out.println("Enter your choice ");
            choice = sc.nextInt();

        }
    }
}

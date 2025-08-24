package Services.Cancellation;

import Services.Booking.Booking;
import java.util.ArrayList;
import java.util.HashMap;

public class Cancellation {
  public Cancellation()
  {
    System.out.println("Cancelliation object is created");
  }
  public void cancel(HashMap<String, ArrayList<Booking>> seats,String name,String source,String destination)
  {
   String[] arg={"AC","Non-AC","Seater"};
   int c=0;
   for(String g:arg)
   {
    for(Booking l:seats.get(g))
    {
      // System.out.println(g+" "+l.name+" "+l.source +" "+ l.destination);
      if(l.name.equals(name) && l.source.equals(source) && l.destination.equals(destination) )
      {
        c++;
        l.status="cancelled";
        break;
      }

    }
    if(c>0)
    {
      break;
    }
   }
   System.out.println((c==0)?"No data found with this given inputs please enter the correct datas":"Ticket cancellation succesful");
  }
}

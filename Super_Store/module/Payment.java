package module;

import java.util.ArrayList;
import java.util.*;
public class Payment {

    public static int payid = 0;
    public String customer;
    public String item;
    public int quantity;
    public int amount;
    public int status;

    public Payment() {
        System.out.println("Paymentobject is created");
    }

    public Payment(String customer, String item, int quantity, int amount, int status) {
        this.payid = payid++;
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
        this.status = status;
    }
    public void make_payment(String cname,String pname,int qu,int amt,ArrayList<Payment> payment_list)
    {
      Scanner sc=new Scanner(System.in);
     for(Payment pay:payment_list)
     {
      if(pay.customer.equals(cname) && pay.item.equals(pname) && pay.quantity==qu && pay.amount==amt && pay.status!=1)
      {
       System.out.println("Please Enter the amount");
       int am=sc.nextInt();
       System.out.println("Enter your pin");
       int pin=sc.nextInt();
      System.out.println("Payment Successful");
      pay.status=1;
      return ;

      }
     }
     
    }

}

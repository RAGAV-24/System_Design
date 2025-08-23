package module;

import java.util.TreeMap;
import java.util.*;

public class Item {
  public String itemname;
  public int quantity;
  public int price;
  public int avalcount;
  public Item()
  {
    System.out.println("Item class Object is created");
  }
  public Item(String itemname,int quant,int price,int avalcount)
  {
    this.itemname=itemname;
    this.quantity=quant;
    this.price=price;
    this.avalcount=avalcount;

  }
  public void order(String username,String name,int quant,TreeMap<String,Item> map,ArrayList<Payment> payament_list)
  {
    if(!map.containsKey(name))
    {
      System.out.println("The entered item is not in the inventory");
      return ;

    }
    int aval_count=map.get(name).avalcount;
    int amount=map.get(name).price;
    if(aval_count<quant)
    {
      System.out.println("The ite is not sufficiet to the quantity you provided");
      return;
    }
    Payment pp=new Payment(username,name,quant,amount,0);
    payament_list.add(pp);
    System.out.println("Make your payment successfull and the order will be conformed");
    return;


  }

}

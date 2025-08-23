package module;
import java.util.*;

public class Profile {
  public int id;
  public String name;
  public String password;
  public ArrayList<Integer> total_amount_spent;

  public Date created_At;
  public String role;
  public Profile()
  {
    System.out.println("Object is created for the profile");
  }
  public Profile(int id,String name,String password,String role)
  {
   this.id= id;
  this.name=name;
  this.password=password;
  this.total_amount_spent=new ArrayList<>();
  this.created_At=new Date();
  this.role=role;

  }
  public String get_profile(String name,String role,ArrayList<Profile> ll)
  {
    for(Profile p:ll)
    {
      if(p.name.equals(name) && p.role.equals(role)){
        return "Id:"+p.id+"\nName: "+p.name+"\nPassword"+p.password+"\n Amount Spent:"+p.total_amount_spent.toString()+"\n Created At:"+p.created_At+"\n Role:"+p.role;

      }
    }
    return "";
  }

}

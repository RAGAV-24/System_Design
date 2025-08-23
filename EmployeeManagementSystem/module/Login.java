package module;
import java.util.*;
public class Login {
  public static String main(ArrayList<Users> user) {
      Scanner sc=new Scanner(System.in);
      String id=sc.next();
      String password=sc.next();
      int c=0;
      for(Users u:user)
      {
       if(u.id.equals(id))
       {
        c++;
        if(u.password.equals(password) )
        {
        System.out.println("Login Successful ");
        return (u.role=="admin")?"admin":"employee";
        }
        else{
          System.out.println("Enter the correct password");
          return "Incorrect passord";
        }
       }
      }
      if(c==0)
      {
       return "Noone exsist with the given user credential";
      }
    return "rog";
  }
}

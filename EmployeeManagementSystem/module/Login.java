package module;
import java.util.*;
public class Login {
  public static void main(ArrayList<Users> user) {
      Scanner sc=new Scanner(System.in);
      String id=sc.next();
      String password=sc.next();
      int c=0;
      for(Users u:user)
      {
       if(u.id.equals(id))
       {
        c++;
        if(u.password.equals(password))
        {
        System.out.println("Login Successful");
        }
        else{
          System.out.println("Enter the correct password");
        }
       }
      }
      if(c==0)
      {
        System.out.println("Noone exsist with the given user credential");
      }

  }
}

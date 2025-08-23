package module;
import java.util.*;
public class Login {
  public String username;
  public String password;
  public String role;
  public Login()
  {
    System.out.println("Object is created for this Login class");
  }
  public Login(String username ,String password,String role)
  {
    this.username=username;
    this.password=password;
    this.role=role;
  }
  public String auth(String u,String pass,ArrayList<Login> l)
  {
    int c=0;
   for(Login h:l)
   {
    if(h.username.equals(u))
    {
      c++;
      if(h.password.equals(pass))
      {
        System.out.println("Login successful");
        return "1 "+h.role;
      }
      else{
        System.out.println("Check the password");
        return "0 ";
      }
    }

   }
   if(c==0)
   {
    System.out.println("There is no user with this login credential");
   }
   return "0 ";
  }
}

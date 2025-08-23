import java.util.*;
import module.Employee;
import module.Login;
import module.Users;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of employee");
    int a=sc.nextInt();
    ArrayList<Employee> l=new ArrayList<>();
    for(int i=0;i<a;i++)
    {
     int emp_id=sc.nextInt();
    String emp_name=sc.next();
    int income=sc.nextInt();
    int experience=sc.nextInt();
    Date joining_date=new Date();
    Employee e=new Employee(emp_id, emp_name, income, experience, joining_date);
    l.add(e);
    }
    // System.out.println("Before sorting");
    // for(Employee e:l)
    // {
    // System.out.println(e.emp_id+" "+e.emp_name+" "+e.income+" "+e.experience+" "+e.joining_date);
    // }
    // // Sorting Based on ID FIELD
    // Collections.sort(l,new Comparator<Employee>()
    // { public int compare(Employee a,Employee b)
    //   {return a.emp_id-b.emp_id;}});
    // SORTING BASED ON LATEST JOINING DATE
    // l.sort(Comparator.comparing((Employee e) -> e.joining_date).reversed());

    // System.out.println("After sorting");
    // for(Employee e:l)
    // {
    // System.out.println(e.emp_id+" "+e.emp_name+" "+e.income+" "+e.experience+" "+e.joining_date);
    // }
    ArrayList<Users> users=new ArrayList<>();
    for(Employee e:l)
    {
    Users ee=new Users(e.emp_name+e.emp_id,"123456","employee");

   users.add(ee);
    }
    users.add(new Users("admin001","123456","admin"));
    System.out.println("Enter the login id followed by a space and password");
    Login login=new Login();
    String login_id=Login.main(users);
    System.out.println(login_id);
    String[] user_auth=login_id.split(" ");
    if(user_auth[0].equals("employee"))
    {
    System.out.println(user_auth[0]+"*");
    System.out.println("1.Fetch_profile ");
    System.err.println("ENTER THE CHOICE YOU NEED");
    int choice=sc.nextInt();
    Employee e=new Employee();
    switch(choice)
    {
     case 1:
     e.fetch_data(user_auth[1],l);
     break;
     default:
     System.out.println("Enter the correct  input");
    }
    }
    else if(user_auth[0].equals("admin"))
    {
    System.out.println(user_auth[0]+"*71");
    System.out.println("1.add_employee 2.display_all_employee");
    System.err.println("ENTER THE CHOICE YOU NEED");
    int choice=sc.nextInt();
    Employee e=new Employee();
    switch(choice)
    {
     case 1:
     e.add_employee(l,users);
      e.display_all_employee(l);
     break;
     case 2:
     e.display_all_employee(l);

     default:
     System.out.println("Enter the correct  input");
    }

    }
    else
    {
      System.out.println(user_auth[0]);
    }


  }
}
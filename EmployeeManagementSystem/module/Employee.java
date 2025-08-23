package module;

import java.util.*;

public class Employee {

    public int emp_id;
    public String emp_name;
    public int income;
    public int experience;
    public Date joining_date;
// public String joining_date;
    public Employee()
    {
      System.out.println("Onject is created for employee class");

    }
    public Employee(int emp_id, String emp_name, int income, int experience, Date joining_date) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.income = income;
        this.experience = experience;
        this.joining_date = joining_date;
    }
    public void fetch_data(String r,ArrayList<Employee> l)
    {
     for(Employee e:l)
     {
      String k=e.emp_name+e.emp_id;
      if(k.equals(r))
      {
        System.out.println("emp_id "+e.emp_id);
         System.out.println("emp_name"+e.emp_name);
        System.out.println("emp_income"+e.income);
        System.out.println("emp_experience"+e.experience);
        System.out.println("emp_joining date"+e.joining_date);
      }
     }
    }
    public void display_all_employee(ArrayList<Employee> l)
    {
       for(Employee e:l)
    {
    System.out.println(e.emp_id+" "+e.emp_name+" "+e.income+" "+e.experience+" "+e.joining_date);
    }
    }
    public void add_employee(ArrayList<Employee> l,ArrayList<Users> users)
    {
      Scanner sc=new Scanner(System.in);
      int emp_id=sc.nextInt();
      String emp_name=sc.next();
      int income=sc.nextInt();
      int experience=sc.nextInt();
      Date joining_date=new Date();
       Employee e=new Employee(emp_id, emp_name, income, experience, joining_date);
       l.add(e);
        Users ee=new Users(e.emp_name+e.emp_id,"123456","employee");

      users.add(ee);
      
    }


}

import java.util.*;
import module.Employee;
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
    System.out.println("Before sorting");
    for(Employee e:l)
    {
    System.out.println(e.emp_id+" "+e.emp_name+" "+e.income+" "+e.experience+" "+e.joining_date);
    }
    Collections.sort(l,new Comparator<Employee>()
    { public int compare(Employee a,Employee b)
      {return a.emp_id-b.emp_id;}});
    System.out.println("After sorting");
    for(Employee e:l)
    {
    System.out.println(e.emp_id+" "+e.emp_name+" "+e.income+" "+e.experience+" "+e.joining_date);
    }

  }
}
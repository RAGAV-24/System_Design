package module;

import java.util.Date;

public class Employee {

    public int emp_id;
    public String emp_name;
    public int income;
    public int experience;
    public Date joining_date;
// public String joining_date;

    public Employee(int emp_id, String emp_name, int income, int experience, Date joining_date) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.income = income;
        this.experience = experience;
        this.joining_date = joining_date;
    }
}

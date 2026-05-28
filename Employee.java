import java.util.*;
class Employee{
        int empid;
        String empname;
        int salary;
        void setdata(){
    }
    void display(){
        System.out.println("employee id :"+empid);
         System.out.println("name :"+empname);
        System.out.println("salary :"+salary);
    }
    void bonus(){
       int bonusSalary=salary+5000;
        System.out.println("bonusSalary:"+bonusSalary);
    }
    public static void main(String args[]){
        Employee e1=new Employee();
        Employee e2=new Employee();

      
        e1.empid=101;
        e1.empname="Arun pandi";
        e1.salary=20000;

        e2.empid=102;
        e2.empname="Aathiran mukil";
        e2.salary=30000;

        e1.setdata();
        e1.display();
        e1.bonus();

        e2.setdata();
        e2.display();
        e2.bonus();


    }
}
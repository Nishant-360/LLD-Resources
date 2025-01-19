package org.example.ProxyDesignPattern;

public class Demo {
    public static void main(String[] args){
        try{
            EmployeeDao employeeDaoObj=new EmployeeDaoProxy();
            employeeDaoObj.create("USER",new Employee(2,"PAVAN"));
            System.out.println("Operation Successful");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

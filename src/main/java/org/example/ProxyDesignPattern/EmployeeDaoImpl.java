package org.example.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, Employee obj) throws Exception {
         // Create a new row
        System.out.println("Create a new row in the Employee Table with employee name : "+obj.getName());
    }

    @Override
    public void delete(String client, Employee obj) throws Exception {
    // Delete a row
        System.out.println("Delete a row in the Employee Table with employeeId : "+obj.getEmployeeId());
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        // fetch row from DB
        System.out.println("Fetching employee data based on employeeID from Employee Table");
        return new Employee(1,"Aman");
    }
}

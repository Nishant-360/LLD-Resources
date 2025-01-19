package org.example.ProxyDesignPattern;

public class EmployeeDaoProxy implements  EmployeeDao{

    EmployeeDao employeeDaoObj;

    public EmployeeDaoProxy() {
        employeeDaoObj = new EmployeeDaoImpl();
    }


    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client=="ADMIN"){
            employeeDaoObj.create(client,obj);
            return;
        }
        throw new Exception("ACCESS DENIED");
    }

    @Override
    public void delete(String client, Employee obj) throws Exception {
        if(client=="ADMIN"){
            employeeDaoObj.delete(client,obj);
            return;
        }
        throw new Exception("ACCESS DENIED");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client=="ADMIN" || client=="USER"){
            return employeeDaoObj.get(client,employeeId);
        }
        throw new Exception("ACCESS DENIED");
    }
}

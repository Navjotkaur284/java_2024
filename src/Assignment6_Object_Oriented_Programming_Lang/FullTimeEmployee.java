package Assignment6_Object_Oriented_Programming_Lang;

public class FullTimeEmployee extends Employee{
        double salary;
    public FullTimeEmployee(String EmployeeId, String EmployeeName, double salary){

        super(EmployeeId, EmployeeName);
        this.salary = salary;
    }

    public double calculatePay() {
        System.out.print("The pay of Full Time Employee: ");
        return salary;
    }
}

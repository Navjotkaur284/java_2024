package Assignment6_Object_Oriented_Programming_Lang;

public class PartTimeEmployee extends Employee{

   protected double salary;
    public PartTimeEmployee(String EmployeeId, String EmployeeName, double salary){
        super(EmployeeId, EmployeeName);
        this.salary = salary;

    }

    public double calculatePay(){
        System.out.print("The pay of Part Time Employee:");
        return salary;
    }

}

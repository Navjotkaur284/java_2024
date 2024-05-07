package Assignment6_Object_Oriented_Programming_Lang;

public class Employee {
    protected String EmployeeId;
    protected String EmployeeName;

    public Employee(String EmployeeId, String EmployeeName){
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
    }
    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getName() {
        return EmployeeName;
    }

    public double calculatePay(){
        return 0.0;
    }
}

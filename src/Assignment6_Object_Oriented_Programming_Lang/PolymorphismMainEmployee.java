package Assignment6_Object_Oriented_Programming_Lang;

public class PolymorphismMainEmployee {
    public static void main(String[] args){
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Emp001", "Navjot",  7500.00);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Emp002", "Jot", 3000.00);

        System.out.println("Full Time Employee Name: " + fullTimeEmployee.getName());
        System.out.println("Full Time Employee Id: " +fullTimeEmployee.getEmployeeId());
        System.out.println(fullTimeEmployee.calculatePay());

        System.out.println("\nPart Time Employee Name: " + partTimeEmployee.getName());
        System.out.println("Part Time Employee Id: " +partTimeEmployee.getEmployeeId());
        System.out.println(partTimeEmployee.calculatePay());
    }
}
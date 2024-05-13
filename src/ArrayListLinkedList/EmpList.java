package ArrayListLinkedList;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
    public static void main (String[] args){
        List<EmployeeArray> empListList = new ArrayList<>();

        empListList.add(new EmployeeArray("John","john@gmail.com", 39, "Canada"));
        empListList.add(new EmployeeArray("Mark","mark@gmail.com", 39, "Us"));
        empListList.add(new EmployeeArray("Peter","peter@gmail.com", 39, "Us"));
        empListList.add(new EmployeeArray("Mike","mike@gmail.com", 39, "Australia"));
        empListList.add(new EmployeeArray("Smith","smith@gmail.com", 39, "Mexico"));
        empListList.add(new EmployeeArray("Joe","joe@gmail.com", 39, "US"));
        empListList.add(new EmployeeArray("Dan","dann@gmail.com", 39, "Canada"));
        empListList.add(new EmployeeArray("Will","will@gmail.com", 39, "Mexico"));

    }
}

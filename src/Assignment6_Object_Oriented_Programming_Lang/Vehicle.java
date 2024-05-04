package Assignment6_Object_Oriented_Programming_Lang;

import com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator;

public class Vehicle {
   protected String make;
   protected String model;
   protected int year;

   public Vehicle(String make, String model, int year){
       this.make = make;
       this.model = model;
       this.year = year;
   }

   public void start(){
        System.out.println("The vehicle starts.");
   }
   public void stop(){
       System.out.println("The vehicle stops.");
   }
   public void displayInfo(){
       System.out.println("The make of Vehicle: " + make);
       System.out.println("The model of Vehicle: " + model);
       System.out.println("The year of Vehicle: " + year);

   }
}

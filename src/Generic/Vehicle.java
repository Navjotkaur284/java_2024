package Generic;

public class Vehicle<T, R> {
    T model;
    R year;

    public Vehicle(T model, R year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model=" + model +
                ", year=" + year +
                '}';
    }
}

class Main {
    public static void main(String[] args){

        Vehicle<String, Integer >vehicle= new Vehicle<String, Integer>("BMW", 2023);
        System.out.println(vehicle);
    }
}
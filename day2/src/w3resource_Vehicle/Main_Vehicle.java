package day2.src.W3resource_vehicle;

public class Main_Vehicle {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", "Camry", 2020, 15.5);
        System.out.println("Car Details:");
        car.displayDetails();
        
        Truck truck = new Truck("Ford", "F-150", 2019, 2.5);
        System.out.println("\nTruck Details:");
        truck.displayDetails();
    
    }
}

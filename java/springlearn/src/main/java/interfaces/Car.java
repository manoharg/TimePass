package interfaces;

public class Car implements  Vehicle {

    @Override
    public void drive() {
        System.out.println("car is running..");
    }
}

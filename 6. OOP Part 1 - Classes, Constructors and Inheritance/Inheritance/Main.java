public class Main {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}

/*
OUTPUT:

Vehicle.steer(): Steering at 45 degrees.
Car.setCurrentGear(): Changed to 3 gear.
Car.changeVelocity(): Velocity 30 direction 45
Vehicle.move(): Moving at 30 in direction45
Car.setCurrentGear(): Changed to 4 gear.
Car.changeVelocity(): Velocity 50 direction 45
Vehicle.move(): Moving at 50 in direction45
Car.setCurrentGear(): Changed to 1 gear.
Car.changeVelocity(): Velocity 8 direction 45
Vehicle.move(): Moving at 8 in direction45

*/

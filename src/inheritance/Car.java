package inheritance;

public class Car {
    public int gearPosition;
    public int speed;

    public Car(int gearPosition, int speed) {
        this.gearPosition = gearPosition;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void changeGear(int newgearPosition) {
        this.gearPosition = newgearPosition;
    }
}

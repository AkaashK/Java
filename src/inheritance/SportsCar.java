package inheritance;

public class SportsCar extends Car{
    public int seatHeight;

    public SportsCar(int gearPosition, int speed, int seatHeight) {
        super(gearPosition, speed);
        this.seatHeight = seatHeight;
    }
}

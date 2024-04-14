public class McLaren extends SportCar implements Printable {
    String color;

    public McLaren(double accelerationTime, int maxSpeed, String color) {
        super(accelerationTime, maxSpeed);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("McLaren: ");
        System.out.println("Acceleration Time: " + accelerationTime);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Color: " + color);
    }
}

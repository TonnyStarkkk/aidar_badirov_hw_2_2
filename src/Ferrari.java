public class Ferrari extends SportCar implements Printable{

    String model;

    public Ferrari(double accelerationTime, int maxSpeed, String model) {
        super(accelerationTime, maxSpeed);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Ferrari: ");
        System.out.println("Acceleration Time: " + accelerationTime);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Model: " + model);
    }
}

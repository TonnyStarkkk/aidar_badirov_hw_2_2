public class Bugatti extends SportCar implements Printable{
    double engineCapacity;

    public Bugatti(double accelerationTime, int maxSpeed, double engineCapacity) {
        super(accelerationTime, maxSpeed);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void print() {
        System.out.println("Bugatti: ");
        System.out.println("Acceleration Time: " + accelerationTime);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Engine Capacity:" + engineCapacity);
    }
}

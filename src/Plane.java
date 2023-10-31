public class Plane extends Vehicle {
    private int height;
    private int passengers;

    public Plane(double price, int speed, int year, int height, int passengers) {
        super(price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Висота: " + height);
        System.out.println("Кількість пасажирів: " + passengers);
    }
}

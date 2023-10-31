public class Vehicle {
    private double price;
    private int speed;
    private int year;

    public Vehicle(double price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Ціна: " + price);
        System.out.println("Швидкість: " + speed);
        System.out.println("Рік випуску: " + year);
    }
}

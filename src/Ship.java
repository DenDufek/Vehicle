public class Ship extends Vehicle {
    private int passengers;
    private String port;

    public Ship(double price, int speed, int year, int passengers, String port) {
        super(price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кількість пасажирів: " + passengers);
        System.out.println("Порт приписки: " + port);
    }
}

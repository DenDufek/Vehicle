public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1_000_000, 900, 2020, 10000, 200);
        Car car = new Car(50_000, 200, 2022);
        Ship ship = new Ship(2_000_000, 30, 2018, 500, "New York");

        System.out.println("Інформація про літак:");
        plane.displayInfo();
        System.out.println();

        System.out.println("Інформація про автомобіль:");
        car.displayInfo();
        System.out.println();

        System.out.println("Інформація про корабель:");
        ship.displayInfo();
    }
}

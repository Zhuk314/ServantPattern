package app;

import servant.DriveServant;
import serviced.Car;
import serviced.Motorcycle;
import serviced.SemiTruck;
import utils.Direction;

/**
 * @author Yurii Zhuk, David Pavlenko
 * @version 1.0
 */
public class Application {
    /**
     * This method runs application
     * @param args not used
     */
    public static void main(String[] args) {
        servantTest();
    }

    private static void servantTest() {
        Car car = new Car();
        SemiTruck truck = new SemiTruck();
        Motorcycle motorcycle = new Motorcycle();

        DriveServant servant = new DriveServant();

        servant.driveTo(car, Direction.STRAIGHT, 10);
        servant.driveTo(car, Direction.LEFT, 5);
        servant.driveTo(car, Direction.RIGHT, 5);
        System.out.println(car);

        servant.driveTo(truck, Direction.STRAIGHT, 3);
        servant.driveTo(truck, Direction.LEFT, 50);
        servant.driveTo(truck, Direction.REVERSE, 10);
        System.out.println(truck);

        servant.driveTo(motorcycle, Direction.REVERSE, 10);
        servant.driveTo(motorcycle, Direction.RIGHT, 15);
        servant.driveTo(motorcycle, Direction.STRAIGHT, 25);
        System.out.println(motorcycle);

        servant.refuel(car);

        System.out.println("Car after refueling\n" + car);
    }

}

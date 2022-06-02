package app;

import servant.DriveServant;
import serviced.Car;
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
        Car myFord = new Car();
        DriveServant servant = new DriveServant();

        servant.driveTo(myFord, Direction.STRAIGHT, 10);
        servant.driveTo(myFord, Direction.LEFT, 5);
        servant.driveTo(myFord, Direction.RIGHT, 5);
        servant.driveTo(myFord, Direction.STRAIGHT, 20);
        servant.driveTo(myFord, Direction.LEFT, 15);


        System.out.println(myFord);

        servant.refuel(myFord);

        System.out.println("After refuel\n " + myFord);
    }
}

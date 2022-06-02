package servant;

import serviced.IDrivable;
import utils.Direction;

/**
 * @author Yurii Zhuk, David Pavlenko
 * @version 1.0
 */
public class DriveServant {
    /**
     * @param serviced IDrivable object
     * @param direction enum to indicate direction
     * @param distance to drive
     */
    public void driveTo(IDrivable serviced, Direction direction, int distance) {
        if (!serviced.isEnoughFuel(distance)){
            System.out.println("Low fuel.");
            return;
        }
        serviced.turnEngineOn();
        serviced.setNewDirection(direction);
        serviced.drive(distance);
        serviced.turnEngineOff();
    }

    /** Refuel to full serviced object
     *
     * @param serviced IDrivable object
     */
    public void refuel(IDrivable serviced){
        serviced.turnEngineOff();
        serviced.refuel();
    }
}

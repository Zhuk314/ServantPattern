package serviced;

import utils.Direction;

/**
 * @author Yurii Zhuk, David Pavlenko
 * @version 1.0
 */
public interface IDrivable {
    /**
     * Turns engine on
     */
    void turnEngineOn();

    /**
     * Turns engine off
     */
    void turnEngineOff();

    /**
     * Checks is there enough fuel for some distance
     * @param distance to check
     * @return is there enough fuel for provided distance
     */
    boolean isEnoughFuel(int distance);

    /**
     * Sets fuel to maximum
     */
    void refuel();


    /** gives new direction for object
     *
     * @param direction new directon
     */
    void setNewDirection(Direction direction);

    /** Preform drive method for Drivable object
     *
     * @param distance to drive
     */
    void drive(int distance);
}

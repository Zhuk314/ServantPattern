package serviced;

import utils.Direction;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yurii Zhuk, David Pavlenko
 * @version 1.0
 */
public class Motorcycle implements IDrivable{
    private final int MAX_FUEL_LOAD = 100;

    private boolean isEngineOn;
    private int fuelLoad;
    private Direction direction;
    private Map<Direction, Integer> trip;

    /**
     * Constructor for Car Class
     */
    public Motorcycle() {
        this.trip = new HashMap<>();
        this.isEngineOn = false;
        this.fuelLoad = MAX_FUEL_LOAD;
        this.direction = Direction.STRAIGHT;
    }

    @Override
    public void turnEngineOn() {
        setEngineOn();
    }

    @Override
    public void turnEngineOff() {
        setEngineOff();
    }

    @Override
    public boolean isEnoughFuel(int distance) {
        return distance <= this.fuelLoad;
    }

    @Override
    public void refuel() {
        setFuelLoad(MAX_FUEL_LOAD);
    }

    @Override
    public void setNewDirection(Direction direction) {
        setDirection(direction);
    }

    @Override
    public void drive(int distance) {
        this.trip.put(this.direction, distance);
        this.fuelLoad = this.fuelLoad - distance;
    }

    /** Getter for isEngineOn field
     *
     * @return true if engine is on
     */
    public boolean isEngineOn() {
        return isEngineOn;
    }

    /**
     * Turns engine on (sets isEngineOn to true)
     */
    public void setEngineOn() {
        isEngineOn = true;
    }

    /**
     * Turns engine off (sets isEngineOn to false)
     */
    public void setEngineOff() {
        isEngineOn = false;
    }

    /** Getter for fuelLoad field
     *
     * @return fuelLoad current capacity
     */
    public int getFuelLoad() {
        return fuelLoad;
    }

    /** Setter for fuelLoad field
     *
     * @param fuelLoad new integer for fuelLoad field
     */
    public void setFuelLoad(int fuelLoad) {
        this.fuelLoad = fuelLoad;
    }

    /** Getter for direction field
     *
     * @return current direction of car
     */
    public Direction getDirection() {
        return direction;
    }

    /** Setter for direction field
     *
     * @param direction new direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /** Getter for trip field
     *
     * @return current direction of car
     */
    public Map<Direction, Integer> getTrip() {
        return trip;
    }

    /** Setter for trip field
     *
     * @param trip pair of direction and distance
     */
    public void setTrip(Map<Direction, Integer> trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "Motorcycle{\n" +
                "fuel level = " + fuelLoad + ",\n" +
                "current direction = " + direction + ",\n" +
                "total trip = " + trip + "\n" +
                "}";
    }
}

import java.awt.Color;

/**
 * Car is a superclass to Volvo240 and Saab95. It implements from the class movable. It includes the attributes of the car. Abstract so it can't be an object
 */
public abstract class Car implements Movable{
	private int nrDoors; /** * Number of doors on the car */
    private double enginePower; /** * Engine power of the car */
    protected double currentSpeed; /** /* The current speed of the car */
    private Color color; /** /* Color of the car */
    private String modelName; /** /* The car model name */
    private Location carLoc; /** /* The location of the car */

	private int direction; /** /* Direction of the car */
    public static final int NORTH = 0; /** /* The direction NORTH */
    public static final int EAST = 1; /** /* The direction EAST */
    public static final int SOUTH = 2; /** /* The direction SOUTH */
    public static final int WEST = 3;/** /* The direction WEST */

	/**
	 * The attributes of a car
	 * @param loc The cars location
	 * @param dir The cars direction
	 * @param nrDoors The number of doors on the car
	 * @param color The color of the car
	 * @param enginePower The amount of enginepower
	 * @param modelname The cars name
	 */
    public Car(Location loc, int dir, int nrDoors, Color color, double enginePower, String modelname ) {
    	carLoc = loc;
        direction = dir;
   	 this.nrDoors = nrDoors;
   	 this.color = color;
   	 this.enginePower = enginePower;
 	 this.modelName = modelName;

	 stopEngine();
    }

	/**
	 * A getter for the number of car doors
 	 * @return number of car doors as an int
	 */
	public int getNrDoors(){
        return nrDoors;
    }

	/**
	 * A getter for enginePower
	 * @return enginePower as a double
	 */
    public double getEnginePower(){
        return enginePower;
    }

	/**
	 * Getter for currentSpeed
	 * @return CurrentSpeed as a double
	 */
    public double getCurrentSpeed(){
        return currentSpeed;
    }

	/**
	 * Getter for the color
	 * @return the color as a color
	 */
    public Color getColor(){
        return color;
    }

	/**
	 * Method to return Location
	 * @return Location
	 */
	public Location getLocation(){
		return carLoc;
	}

	/**
	 * Setter for color
	 * @param clr Changes current color to the new specified
	 */
    public void setColor(Color clr){
	    color = clr;
    }

	/**
	 * A method to give currentSpeed the value 0.1
	 */
    public void startEngine(){
	    currentSpeed = 0.1;
    }

	/**
	 * A method to set currentSpeed to o
	 */
    public void stopEngine(){
	    currentSpeed = 0;
    }

	/**
	 * A method to get currentLocation
	 * @return Location as a string
	 */



	@Override
	/**
	 * A method that changes the Location due to the direction
	 */
	public void move() {
		
		if(direction == NORTH) {
			carLoc = new Location(carLoc.getX(), carLoc.getY() + currentSpeed);
			
		} else if(direction == SOUTH) {
			carLoc = new Location(carLoc.getX(), carLoc.getY() - currentSpeed);
			
		} else if(direction == WEST) {
			carLoc = new Location(carLoc.getX() - currentSpeed, carLoc.getY());
			
		} else if(direction == EAST) {
			carLoc = new Location(carLoc.getX() + currentSpeed, carLoc.getY());
		
		}
		
	}
	@Override
	/**
	 * Changes the direction anticlockwise
	 */
	public void turnLeft() {
		if (direction == NORTH) {
			direction = WEST;
		}
		else if (direction == WEST) {
			direction = SOUTH;
		}
		else if (direction == SOUTH) {
			direction = EAST;
		}
		else if (direction == EAST) {
			direction = NORTH;
		}
		
	}
	@Override
	/**
	 * Changes the direction clockwise
	 */
	public void turnRight() {
		if (direction == NORTH) {
			direction = EAST;
		}
		else if (direction == WEST) {
			direction = NORTH;
		}
		else if (direction == SOUTH) {
			direction = WEST;
		}
		else if (direction == EAST) {
			direction = SOUTH;
		}
		
	}
   

}

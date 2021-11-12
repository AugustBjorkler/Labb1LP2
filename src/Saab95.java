import java.awt.*;

/**
 * Class Saab95 extends Car
 */
public class Saab95 extends Car{
    /**
     * An attribute that a Saab has but not car
     */
	private boolean turboOn;

    /**
     * Constructor for Saab. Saab has some attributes we can choose and some we get from the superclass.
     * @param loc Starting location of car
     * @param dir Starting direction of car
     * @param color Color of the car
     * @param turboOn Is the turbo on
     */
    public Saab95(Location loc, int dir, Color color, boolean turboOn){
    	super(loc, dir, 2, color, 125, "Saab95");
       
	    this.turboOn = turboOn;
       

    }

    /**
     * Sets turboOn to true
     */
    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Sets turboOn to false
     */
    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * SpeedFactor is a method that is used in incrementSpeed to increase currentSpeed
     * @return enginePower multiplied by a factor that depends on wheter turbo is on or off
     */
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    /**
     * Increases currentSpeed by a specified amount
     * @param amount Adds speed to currentSpeed
     */
    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        if (currentSpeed > getEnginePower()){
            currentSpeed = getEnginePower();
        }
    }

    /**
     * Decreases currentSpeed by a specified amount
     * @param amount Slows the speed down
     */
    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        if(currentSpeed < 0){
            currentSpeed = 0;
        }
    }

}
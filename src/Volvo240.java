import java.awt.*;

/**
 * The sub-class Volvo240 to the super-class Car specifies what a Car of the type Volvo240 is.
 */
public class Volvo240 extends Car{

    /**
     * a constant with the value 1.25 which is used for speed factor
     */
    private final static double trimFactor = 1.25;

    /**
     * The constructor for Volvo240. It makes use of its super-constructor, but 3 out of the 6 parameters are already defined for every Car of the type Volvo240.
     * @param loc Requires the location of the Volvo240
     * @param dir Requires the direction of the Volvo240
     * @param color Requires the color of the Volvo240
     */
    public Volvo240(Location loc, int dir, Color color){
        super(loc, dir, 4, color, 100, "Volvo240");
    }

    /**
     * Method for describing the speed factor, which is used in the increment speed.
     * @return the speed factor
     */
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    /**
     * Method for describing the increment speed, which is used in gas. It updates our value of the current speed.
     * @param amount By how much we want to increase the speed.
     */
    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower());
        if (getEnginePower() < currentSpeed){
            currentSpeed = getEnginePower();
        }
    }

    /**
     * Method for describing the decrement speed, which is used in brake. It updates our value of the current speed.
     * @param amount By how much we want to decrease the speed.
     */
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        if(currentSpeed<0){
            currentSpeed =0;
        }
    }


    /**
     * Method for increasing the speed. Amount of speed increase must be within [0,1].
     * @param amount By how much we want to increase the speed.
     */
    public void gas(double amount){
        if(amount < 0) {
            amount = 0;
        } else if(1 < amount) {
            amount = 1;
        }
        incrementSpeed(amount);
    }


    /**
     * Method for (decreasing the speed) braking. Amount of break increase must be within [0,1].
     * @param amount By how much we want to decrease the speed.
     */
    public void brake(double amount){
        if(amount < 0) {
            amount = 0;
        } else if(1 < amount) {
            amount = 1;
        }
        decrementSpeed(amount);
    }
}
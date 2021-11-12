import org.junit.Assert;
import java.awt.*;

public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        // Car and Saab95
        Location carLoc = new Location(0,0);
        Saab95 bil = new Saab95(carLoc, Car.NORTH, Color.black, false);

        bil.startEngine();
        // Checking if the engine power is correct
        Assert.assertEquals(125, bil.getEnginePower(), 0.001);

        bil.turnRight();
        bil.setTurboOn();
        bil.incrementSpeed(2);
        bil.move();
        // Checking if the x-coordinate of the car after turning, starting turbo & increasing speed is correct
        Assert.assertEquals(3.35, bil.getLocation().getX(), 0.001);

        bil.setTurboOff();
        bil.turnLeft();
        bil.decrementSpeed(2);
        // Checking if the speed of the car after stopping turbo, turning & decreasing speed is correct
        Assert.assertEquals(0.85, bil.getCurrentSpeed(), 0.001);

        bil.move();
        // Checking if the location of the car is correct
        Assert.assertEquals(0.85, bil.getLocation().getY(), 0.001);

        bil.setColor(Color.CYAN);
        // Checking if the color of the car was altered to cyan
        Assert.assertEquals(Color.CYAN, bil.getColor());
        // Checking if the number of door is correct
        Assert.assertEquals(2,  bil.getNrDoors());

        bil.stopEngine();
        // Checking if the speed of the car is correct after alteration
        Assert.assertEquals(0, bil.getCurrentSpeed(), 0.001);

        // Volvo240
        Location cloc = new Location(0,0);
        Volvo240 bil2 = new Volvo240(cloc, Car.NORTH, Color.blue);

        bil2.startEngine();
        bil2.gas(1);
        // Checking if the speed of the car is correct after alteration
        Assert.assertEquals(1.35, bil2.currentSpeed, 0.001);

        bil2.brake(2);
        // Checking if the speed of the car is correct after alteration
        Assert.assertEquals(0.1, bil2.getCurrentSpeed(), 0.001);

    }
}
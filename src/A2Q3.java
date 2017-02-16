
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city
        City kitchener = new City();

        // create a robot
        Robot karel = new Robot(kitchener, -4, 3, Direction.WEST);

        while (true) {
            //if avenue<0, face south, move
            if (karel.getAvenue() < 0) {
                while (karel.getDirection() == Direction.WEST) {
                    karel.turnLeft();
                }
                while (karel.getDirection() == Direction.NORTH) {
                    karel.turnLeft();
                    karel.turnLeft();
                }
                while (karel.getDirection() == Direction.EAST) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
                karel.move();
            }
            //if avenue>0, face north, move

            else if (karel.getAvenue() > 0) {
                while (karel.getDirection() == Direction.EAST) {
                    karel.turnLeft();
                }
                while (karel.getDirection() == Direction.SOUTH) {
                    karel.turnLeft();
                    karel.turnLeft();
                }
                while (karel.getDirection() == Direction.WEST) {
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
                karel.move();
            }
        }
            
        
    }
}


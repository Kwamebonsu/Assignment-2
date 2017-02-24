
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.City;

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
        //new city
        City kitchener = new City();
        Robot karel = new Robot(kitchener, -4, 4, Direction.WEST);

        while (true) {
            //if karel is not on street 0, move to street 0

            while (karel.getStreet() > 0) {

                while (karel.getDirection() != Direction.NORTH) {
                    karel.turnLeft();
                    while (karel.getDirection() == Direction.NORTH) {
                        karel.move();

                        //stop  when street=0
                        if (karel.getStreet() == 0) {
                            break;
                        }

                    }

                }
            }



            while (karel.getStreet() < 0) {

                while (karel.getDirection() != Direction.SOUTH) {
                    karel.turnLeft();
                    while (karel.getDirection() == Direction.SOUTH) {
                        karel.move();

                        //stop  when street=0
                        if (karel.getStreet() == 0) {
                            break;
                        }
                    }
                }

            }
            //if karel is not on avenue 0, move to avenue 0
            while (karel.getAvenue() > 0) {

                while (karel.getDirection() != Direction.WEST) {
                    karel.turnLeft();
                    while (karel.getDirection() == Direction.WEST) {
                        karel.move();

                        if (karel.getAvenue() == 0) {
                            break;
                        }
                    }
                }
            }

            while (karel.getAvenue() < 0) {

                while (karel.getDirection() != Direction.EAST) {
                    karel.turnLeft();
                    while (karel.getDirection() == Direction.EAST) {
                        karel.move();

                        if (karel.getAvenue() == 0) {
                            break;
                        }
                    }
                }
            }

        }
    }
}

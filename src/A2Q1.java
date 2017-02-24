
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New City
        City kitchener = new City();

        //create 10 things
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        new Thing(kitchener, 1, 8);
        new Thing(kitchener, 1, 9);
        new Thing(kitchener, 1, 10);
        new Thing(kitchener, 1, 11);

        //create robot
        Robot karel = new Robot(kitchener, 1, 1, Direction.EAST);
        //move and pick up things
        while (true) {
            karel.frontIsClear();
            karel.move();
            karel.canPickThing();
            karel.pickThing();
            //stop picking up things once karel has 7 things in his backpack
            if (karel.countThingsInBackpack() >= 7) {
                break;
            }
        }
        //continue to move until karel cannot pick up things
        while (true) {
            karel.canPickThing();
            karel.move();
            if (!karel.canPickThing()) {
                break;
            }
        }

    }
}

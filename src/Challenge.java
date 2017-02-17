
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.City;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new city
        City kitchener = new City();
        //new robot
        Robot karel = new Robot(kitchener, 0, 2, Direction.SOUTH);
        
        //create walls
        new Wall(kitchener, 0, 1, Direction.EAST);
        new Wall(kitchener, 2, 1,Direction.EAST);
        new Wall(kitchener, 3, 1, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.EAST);
        new Wall(kitchener, 5, 1, Direction.EAST);
        new Wall(kitchener, 6, 1, Direction.EAST);
        new Wall(kitchener, 7, 1, Direction.EAST);
        new Wall(kitchener, 8, 1, Direction.EAST);
        new Wall(kitchener, 9, 1, Direction.EAST);
        new Wall(kitchener, 1, 1, Direction.EAST);
        
        new Wall(kitchener, 0, 0, Direction.WEST);
        new Wall(kitchener, 1, 0,Direction.WEST);
        new Wall(kitchener, 2, 0, Direction.WEST);
        new Wall(kitchener, 3, 0, Direction.WEST);
        new Wall(kitchener, 4, 0, Direction.WEST);
        new Wall(kitchener, 5, 0, Direction.WEST);
        new Wall(kitchener, 6, 0, Direction.WEST);
        new Wall(kitchener, 7, 0, Direction.WEST);
        new Wall(kitchener, 8, 0, Direction.WEST);
        new Wall(kitchener, 9, 0, Direction.WEST);
        new Wall(kitchener, 0, 0, Direction.WEST);
        
        new Wall(kitchener, 9, 2, Direction.SOUTH);
        new Wall(kitchener, 9, 2, Direction.EAST);
        new Wall(kitchener, 8, 3, Direction.SOUTH);
        new Wall(kitchener, 8, 4, Direction.SOUTH);
        new Wall(kitchener, 8, 5, Direction.SOUTH);
        new Wall(kitchener, 8, 6, Direction.SOUTH);
        new Wall(kitchener, 8, 7, Direction.SOUTH);
        new Wall(kitchener, 8, 8, Direction.SOUTH);
       
        new Wall(kitchener, 8, 8, Direction.EAST);
        new Wall(kitchener, 7, 8, Direction.EAST);
        
        new Wall(kitchener, 7, 8, Direction.NORTH);
        new Wall(kitchener, 7, 7, Direction.NORTH);
        new Wall(kitchener, 7, 6, Direction.NORTH);
        new Wall(kitchener, 7, 5, Direction.NORTH);
        new Wall(kitchener, 7, 4, Direction.NORTH);
        new Wall(kitchener, 7, 3, Direction.NORTH);
        
        new Wall(kitchener, 5, 2, Direction.EAST);
        new Wall(kitchener, 6, 2, Direction.EAST);
        
        new Wall(kitchener, 4, 3, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 4, 5, Direction.SOUTH);
        
        new Wall(kitchener, 4, 5, Direction.EAST);
        
        new Wall(kitchener, 4, 3, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.NORTH);
        new Wall(kitchener, 4, 5, Direction.NORTH);
        
        new Wall(kitchener, 3, 2, Direction.EAST);
        
        new Wall(kitchener, 2, 3, Direction.SOUTH);
        new Wall(kitchener, 2, 4, Direction.SOUTH);
        new Wall(kitchener, 2, 5, Direction.SOUTH);
        new Wall(kitchener, 2, 6, Direction.SOUTH);
        
        new Wall(kitchener, 2, 6, Direction.EAST);
        new Wall(kitchener, 1, 6, Direction.EAST);
        
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 5, Direction.NORTH);
        new Wall(kitchener, 1, 6, Direction.NORTH);
        
        new Wall(kitchener, 0, 2, Direction.EAST);
        
        //create things
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 4, 2);
        new Thing(kitchener, 7, 2);
        
            }
        }
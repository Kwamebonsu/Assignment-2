
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New City
        City kitchener = new City();
        
        //create walls
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.EAST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 1, 4, Direction.WEST);
        new Wall(kitchener, 1, 4, Direction.SOUTH);
        
        new Wall(kitchener, 4, 1, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.WEST);
        new Wall(kitchener, 4, 1, Direction.SOUTH);
        
        new Wall(kitchener, 4, 4, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.EAST);
        new Wall(kitchener, 4, 4, Direction.WEST);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        
        new Wall(kitchener, 2, 2, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        
        new Wall(kitchener, 2, 2, Direction.WEST);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 3, Direction.EAST);
        
        Robot karel = new Robot(kitchener, 0, 1, Direction.EAST);
        while(true){
            //check if the right side is clear
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            //if the right side is clear, if so, then move
            if(karel.frontIsClear()){
                karel.move();
            }
            //if the front is not clear, turn left the check again
            while(!karel.frontIsClear()){
                karel.turnLeft();
                //if the front is clear then move
                if(karel.frontIsClear()){
                    karel.move();
                }
            }
            }
        }
        
        
        
           } 
           
    


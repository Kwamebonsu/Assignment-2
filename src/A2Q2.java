
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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New City
        City kitchener = new City();
        new Wall(kitchener, 3, 1,Direction.SOUTH);
        new Wall(kitchener, 3, 2,Direction.SOUTH);
        new Wall(kitchener, 3, 3,Direction.SOUTH);
        new Wall(kitchener, 3, 4,Direction.SOUTH);
        new Wall(kitchener, 3, 5,Direction.SOUTH);
        new Wall(kitchener, 3, 6,Direction.SOUTH);
        new Wall(kitchener, 3, 7,Direction.SOUTH);
        new Wall(kitchener, 3, 8,Direction.SOUTH);
        new Wall(kitchener, 3, 2,Direction.EAST);
        new Wall(kitchener, 3, 4,Direction.EAST);
        new Wall(kitchener, 3, 6,Direction.EAST);
        new Thing(kitchener, 3, 8);
        
        
        Robot karel = new Robot(kitchener, 3, 0, Direction.EAST);
        while(true){
           karel.frontIsClear();
           karel.move();
           if(!karel.frontIsClear()){
          karel.turnLeft();
          karel.move();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.move();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.move();
          karel.turnLeft();
           }

          
            if(karel.canPickThing()){
                break;
            }
        }
           } 
           
    }


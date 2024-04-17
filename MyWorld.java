import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        this.addObject(new Player(), 600 / 2, 340);
        this.setupEnemies();
        
    }
    
    public void setupEnemies() {
        int alpha = 50;
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 5; j ++) {
                this.addObject(new Enemy(), i * alpha, j * alpha);
        } }
    }
}

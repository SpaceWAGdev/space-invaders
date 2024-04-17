import greenfoot.*;
import java.util.Timer;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public static boolean canFire = true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.setRotation(-90);
                    
        if (Greenfoot.isKeyDown("A") ){
            setLocation(this.getX() - 10, this.getY());
        }
        
        else if (Greenfoot.isKeyDown("D")) {
            setLocation(this.getX() + 10, this.getY());
        }
        if (Greenfoot.isKeyDown("Space") && canFire) {
            getWorld().addObject(new Projectile(), getX(), getY() + 5);
            canFire = false;
            Timer t = new java.util.Timer();
            t.schedule( new java.util.TimerTask() {
            @Override
            public void run() {
                Player.canFire = true;
                t.cancel();} }, 100 );
        }
        
        if(0 == getWorld().getObjects(Enemy.class).size()) {
            Greenfoot.stop();
        }
    }
}

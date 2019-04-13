import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance Variables
     * these cap be unsed anywhere in the class below
     */
    //will keep track of whether a key was just pressed
    private boolean keyAlreadyDown;
    
    /**
     * Create a new key.
     */
    public Key()
    {
         keyAlreadyDown = false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        // Animate the piano key being pressed
        // Condtion 1 - is the "g" key already pressed 
        //condition 2 - was the key was not already down
        if ( Greenfoot.isKeyDown("g") && keyAlreadyDown == false)
        {
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        }
        
        //stay the key being pressed 
        //Condition 1 - The key was down the last time act() fired
        //Condition 2 - the "g" has been released (no longer being pressed)
        if ((keyAlreadyDown == true)&& (Greenfoot.isKeyDown("g") == false))
        {
            //key is up
            setImage("white-key.png");
            keyAlreadyDown = false;
        }
        
    }
    /**
     * 
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");
    }
}


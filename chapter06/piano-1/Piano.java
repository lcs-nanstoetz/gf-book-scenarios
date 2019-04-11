import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * instance variables
     * (we can use these variables anywhere in the class)
     */
    int frames;
    
    //create the array (list of name)
    String[] peopleInClass = {"Julio", "Liam", "Dima", "Simon", "Osman", 
        "Nick", "Eric", "Phillip", "Joven", "Joe", "Gordon", "Selena",
        "Jason", "Sam", "Jeff"};
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        
        //Initailize the instance variable
        frames = 0;
    }
    /**
     * act 
     * (gets called repeatedly to create animation)
     */
    public void act()
    {
        //track frames
        frames += 1;
        
        //show the frames
        showText(""+ frames, 100, 100);
    }
}
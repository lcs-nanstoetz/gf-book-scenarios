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
     * Instance variables
     * (we can use these variables anywhere in the class)
     */
    int frames;

    // Create the array (list of names)
    String[] peopleInClass = {"Julio", "Liam", "Dima", "Osman", "Nick", "Simon", "Eric", "Phillip", 
            "Joven", "Joe", "Gordon", "Jieun", "Selena", "Jason", "Sam", "Jeff"
        };
        
        String[]whiteKeys = {"a", "s", "d","f","g", "h", "j", "k", " l", ";", "'", "\\"};
        
        String[]whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"}; 
        
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);

        // Initialize instance variables
        frames = 0;
    }

    /**
     * act
     * (gets called repeatedly to create animation)
     */
    public void act()
    {
        // This block of code runs once per second until the end of the
        // array
        int position = frames / 60;
        if ( (frames % 60 == 0) && (frames / 60 < 15) )
        {
            // Only show a message when we are in the bounds of the array
            // showText("Array index is: " + frames / 60, 400, 250);

            // Only say hello when we are in the bounds of the array
            // Say hello to everyone in the class! 
            // showText("Hello " + peopleInClass[frames / 60], 400, 170);

        }

        // Track frames
        frames += 1;

        // Show the frames
        // showText("" + frames, 100, 100);
    }

}



/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Circle pacBody;
    private Triangle pacMouth;
    
    private Square pellet1;
    private Square pellet2;
    private Square pellet3;
    private Circle powerPellet;
    
    private Circle blinkyBody;
    private Circle blinkyEye1;
    private Circle blinkyEye2;
    private Circle blinkyPupil1;
    private Circle blinkyPupil2;
    
    private Circle pinkyBody;
    private Circle pinkyEye1;
    private Circle pinkyEye2;
    private Circle pinkyPupil1;
    private Circle pinkyPupil2;
    
    private Circle inkyBody;
    private Circle inkyEye1;
    private Circle inkyEye2;
    private Circle inkyPupil1;
    private Circle inkyPupil2;
    
    private Circle clydeBody;
    private Circle clydeEye1;
    private Circle clydeEye2;
    private Circle clydePupil1;
    private Circle clydePupil2;
    
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        
        pacBody = new Circle();
        pacMouth = new Triangle();
        
        pellet1 = new Square();
        pellet2 = new Square();
        pellet3 = new Square();
        powerPellet = new Circle();
        
        blinkyBody = new Circle();
        blinkyEye1 = new Circle();
        blinkyEye2 = new Circle();
        blinkyPupil1 = new Circle();
        blinkyPupil2 = new Circle();
        
        
        pinkyBody = new Circle();
        pinkyEye1 = new Circle();
        pinkyEye2 = new Circle();
        pinkyPupil1 = new Circle();
        pinkyPupil2 = new Circle();
        
        inkyBody = new Circle();
        inkyEye1 = new Circle();
        inkyEye2 = new Circle();
        inkyPupil1 = new Circle();
        inkyPupil2 = new Circle();
        
        clydeBody = new Circle();
        clydeEye1 = new Circle();
        clydeEye2 = new Circle();
        clydePupil1 = new Circle();
        clydePupil2 = new Circle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
    
            pacBody.changeColor("yellow");
            pacBody.moveHorizontal(175);
            pacBody.moveVertical(-40);
            pacBody.changeSize(80);
            pacBody.makeVisible();
            
            pacMouth.changeColor("black");
            pacMouth.moveHorizontal(235);
            pacMouth.moveVertical(-50);
            pacMouth.makeVisible();
            
            pellet1.makeVisible();
            pellet1.changeColor("white");
            pellet1.changeSize(10);
            pellet1.moveHorizontal(130);
            pellet1.moveVertical(15);
            
            pellet2.makeVisible();
            pellet2.changeColor("white");
            pellet2.changeSize(10);
            pellet2.moveHorizontal(130);
            pellet2.moveVertical(60);
            
            pellet3.makeVisible();
            pellet3.changeColor("white");
            pellet3.changeSize(10);
            pellet3.moveHorizontal(130);
            pellet3.moveVertical(105);
            
            powerPellet.makeVisible();
            powerPellet.changeColor("white");
            powerPellet.changeSize(25);
            powerPellet.moveHorizontal(195);
            powerPellet.moveVertical(175);
            
            blinkyBody.makeVisible();
            blinkyBody.changeColor("red");
            blinkyBody.changeSize(80);
            blinkyBody.moveHorizontal(75);
            blinkyBody.moveVertical(-40);
            
            inkyBody.makeVisible();
            inkyBody.changeColor("cyan");
            inkyBody.changeSize(80);
            inkyBody.moveHorizontal(-25);
            inkyBody.moveVertical(-40);
            
            pinkyBody.makeVisible();
            pinkyBody.changeColor("pink");
            pinkyBody.changeSize(80);
            pinkyBody.moveHorizontal(-125);
            pinkyBody.moveVertical(-40);
            
            clydeBody.makeVisible();
            clydeBody.changeColor("orange");
            clydeBody.changeSize(80);
            clydeBody.moveHorizontal(-225);
            clydeBody.moveVertical(-40);
            
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        pacBody.changeColor("white");
        pacMouth.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        pacBody.changeColor("yellow");
        pacMouth.changeColor("black");
    }
}

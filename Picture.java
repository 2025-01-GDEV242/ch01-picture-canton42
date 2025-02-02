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
            
            blinkyEye1.makeVisible();
            blinkyEye1.changeColor("white");
            blinkyEye1.changeSize(25);
            blinkyEye1.moveHorizontal(125);
            blinkyEye1.moveVertical(-20);
            
            blinkyEye2.makeVisible();
            blinkyEye2.changeColor("white");
            blinkyEye2.changeSize(25);
            blinkyEye2.moveHorizontal(100);
            blinkyEye2.moveVertical(-20);
            
            blinkyPupil1.makeVisible();
            blinkyPupil1.changeColor("blue");
            blinkyPupil1.changeSize(15);
            blinkyPupil1.moveHorizontal(135);
            blinkyPupil1.moveVertical(-15);
            
            blinkyPupil2.makeVisible();
            blinkyPupil2.changeColor("blue");
            blinkyPupil2.changeSize(15);
            blinkyPupil2.moveHorizontal(110);
            blinkyPupil2.moveVertical(-15);
            
            inkyBody.makeVisible();
            inkyBody.changeColor("cyan");
            inkyBody.changeSize(80);
            inkyBody.moveHorizontal(-25);
            inkyBody.moveVertical(-40);
            
            inkyEye1.makeVisible();
            inkyEye1.changeColor("white");
            inkyEye1.changeSize(25);
            inkyEye1.moveHorizontal(25);
            inkyEye1.moveVertical(-20);
            
            inkyEye2.makeVisible();
            inkyEye2.changeColor("white");
            inkyEye2.changeSize(25);
            inkyEye2.moveHorizontal(0);
            inkyEye2.moveVertical(-20);
            
            inkyPupil1.makeVisible();
            inkyPupil1.changeColor("blue");
            inkyPupil1.changeSize(15);
            inkyPupil1.moveHorizontal(35);
            inkyPupil1.moveVertical(-15);
            
            inkyPupil2.makeVisible();
            inkyPupil2.changeColor("blue");
            inkyPupil2.changeSize(15);
            inkyPupil2.moveHorizontal(10);
            inkyPupil2.moveVertical(-15);
            
            
            pinkyBody.makeVisible();
            pinkyBody.changeColor("pink");
            pinkyBody.changeSize(80);
            pinkyBody.moveHorizontal(-125);
            pinkyBody.moveVertical(-40);
            
            pinkyEye1.makeVisible();
            pinkyEye1.changeColor("white");
            pinkyEye1.changeSize(25);
            pinkyEye1.moveHorizontal(-75);
            pinkyEye1.moveVertical(-20);
            
            pinkyEye2.makeVisible();
            pinkyEye2.changeColor("white");
            pinkyEye2.changeSize(25);
            pinkyEye2.moveHorizontal(-100);
            pinkyEye2.moveVertical(-20);
            
            pinkyPupil1.makeVisible();
            pinkyPupil1.changeColor("blue");
            pinkyPupil1.changeSize(15);
            pinkyPupil1.moveHorizontal(-65);
            pinkyPupil1.moveVertical(-15);
            
            pinkyPupil2.makeVisible();
            pinkyPupil2.changeColor("blue");
            pinkyPupil2.changeSize(15);
            pinkyPupil2.moveHorizontal(-90);
            pinkyPupil2.moveVertical(-15);
            
            
            clydeBody.makeVisible();
            clydeBody.changeColor("orange");
            clydeBody.changeSize(80);
            clydeBody.moveHorizontal(-225);
            clydeBody.moveVertical(-40);
            
            clydeEye1.makeVisible();
            clydeEye1.changeColor("white");
            clydeEye1.changeSize(25);
            clydeEye1.moveHorizontal(-175);
            clydeEye1.moveVertical(-20);
            
            clydeEye2.makeVisible();
            clydeEye2.changeColor("white");
            clydeEye2.changeSize(25);
            clydeEye2.moveHorizontal(-200);
            clydeEye2.moveVertical(-20);
            
            clydePupil1.makeVisible();
            clydePupil1.changeColor("blue");
            clydePupil1.changeSize(15);
            clydePupil1.moveHorizontal(-165);
            clydePupil1.moveVertical(-15);
            
            clydePupil2.makeVisible();
            clydePupil2.changeColor("blue");
            clydePupil2.changeSize(15);
            clydePupil2.moveHorizontal(-190);
            clydePupil2.moveVertical(-15);
            
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
        
        pellet1.changeColor("white");
        pellet2.changeColor("white");
        pellet3.changeColor("white");
        
        powerPellet.changeColor("white");
        
        blinkyBody.changeColor("white");
        blinkyEye1.changeColor("black");
        blinkyEye2.changeColor("black");
        blinkyPupil1.changeColor("white");
        blinkyPupil2.changeColor("white");
        
        inkyBody.changeColor("white");
        inkyEye1.changeColor("black");
        inkyEye2.changeColor("black");
        inkyPupil1.changeColor("white");
        inkyPupil2.changeColor("white");
        
        pinkyBody.changeColor("white");
        pinkyEye1.changeColor("black");
        pinkyEye2.changeColor("black");
        pinkyPupil1.changeColor("white");
        pinkyPupil2.changeColor("white");
        
        clydeBody.changeColor("white");
        clydeEye1.changeColor("black");
        clydeEye2.changeColor("black");
        clydePupil1.changeColor("white");
        clydePupil2.changeColor("white");
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        pacBody.changeColor("yellow");
        pacMouth.changeColor("black");
        
        pellet1.changeColor("white");
        pellet2.changeColor("white");
        pellet3.changeColor("white");
        
        powerPellet.changeColor("white");
        
        blinkyBody.changeColor("red");
        blinkyEye1.changeColor("white");
        blinkyEye2.changeColor("white");
        blinkyPupil1.changeColor("blue");
        blinkyPupil2.changeColor("blue");
        
        inkyBody.changeColor("cyan");
        inkyEye1.changeColor("white");
        inkyEye2.changeColor("white");
        inkyPupil1.changeColor("blue");
        inkyPupil2.changeColor("blue");
        
        pinkyBody.changeColor("pink");
        pinkyEye1.changeColor("white");
        pinkyEye2.changeColor("white");
        pinkyPupil1.changeColor("blue");
        pinkyPupil2.changeColor("blue");
        
        clydeBody.changeColor("orange");
        clydeEye1.changeColor("white");
        clydeEye2.changeColor("white");
        clydePupil1.changeColor("blue");
        clydePupil2.changeColor("blue");
    }
}

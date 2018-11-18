
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.DARK_GRAY, true);
        
        // Ears:
        RightTriangle earLeftFront = new RightTriangle(new Point(500,175),-30,-150,Color.DARK_GRAY,true);
        RightTriangle earLeftBack = new RightTriangle(new Point(496,165),-15,-100,Color.PINK,true);
        RightTriangle earRightFront = new RightTriangle(new Point(290,165),30,-130,Color.DARK_GRAY,true);
        RightTriangle earRightBack = new RightTriangle(new Point(295,165),12, -98,Color.PINK,true);
        
        // Eyes:
        Oval eyeLeftFront = new Oval (new Point(316,236),60,80,Color.WHITE,true);
        Oval eyeLeftBack = new Oval (new Point(316,236),40,70,Color.BLACK,true);
        Oval eyeRightFront = new Oval (new Point(537,236),60,80,Color.WHITE,true);
        Oval eyeRightBack = new Oval (new Point(537,236),40,70,Color.BLACK,true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(415, 300), 45, Color.BLACK, true);
        
        // Collar:
        Oval collarBase = new Oval (new Point(395,520),400,60,Color.BLUE,true);
        Circle collarCircle = new Circle(new Point (395,520),85,Color.RED,true);
        
        // Polyline
        PolyLine polyline1 = new PolyLine(new Point(300,362),new Point(410,386),50,Color.BLACK,true);
        PolyLine polyline2 = new PolyLine(new Point(410,386),new Point(515,362),50,Color.BLACK,true);
        
        // tongue
        Oval tongue = new Oval (new Point(450,440),45,70,Color.RED,true);
        

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(earLeftFront);
        drawPanel.addShape(earLeftBack);
        drawPanel.addShape(earRightFront);
        drawPanel.addShape(earRightBack);
        drawPanel.addShape(eyeLeftFront);
        drawPanel.addShape(eyeLeftBack);
        drawPanel.addShape(eyeRightFront);
        drawPanel.addShape(eyeRightBack);
        drawPanel.addShape(nose);
        drawPanel.addShape(collarBase);
        drawPanel.addShape(collarCircle);
        drawPanel.addShape(polyline1);
        drawPanel.addShape(polyline2);
        drawPanel.addShape(tongue);
        
        // set background color
        drawPanel.setBackground(Color.CYAN);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

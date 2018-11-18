import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RectangleTestOfficial
{
    // TODO: implement this.
    private static Rectangle s1 = new Rectangle(new Point(100, 100), 100, 100, Color.BLACK, true);
    private static Point s1UL = new Point(50, 50);
    private static Point s1LL = new Point(150, 50);
    private static Point s1UR = new Point(50, 150);
    private static Point s1LR = new Point(150, 150);
    private static Rectangle s2 = new Rectangle(new Point(150, 150), 25, 25, Color.CYAN, false);
    private static Point s2UL = new Point(138, 138);
    private static Point s2LL = new Point(162, 138);
    private static Point s2UR = new Point(138, 162);
    private static Point s2LR = new Point(162, 162);

    /**
     * Right number of points?
     */
    @Test
    public void testRectangleConstructorPointsArrayLength()
    {
        Point[] pts = s1.getLocation();
        Assert.assertEquals(4, pts.length);
    }
    
    /**
     * Check points
     */
    @Test
    public void testRectangleConstructorCalculatedPoints()
    {
        Point[] pts1 = s1.getLocation();
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1UL));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1LL)); 
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1LR));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts1, s1UR));
        
        Point[] pts2 = s2.getLocation();
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2UL));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2LL));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2LR));
        Assert.assertTrue("Expected point not appearing in Sqaure. Make sure that the rectangle is centered "
                + "and uses the width and height correctly.", ShapeUtils.pointInSet(pts2, s2UR));
        
    }
    
    /**
     * Unfilled case
     */
    @Test
    public void testRectangleConstructorUnfilled()
    {
        Assert.assertFalse("Square fill incorrect.", s2.isFilled());
    }
    
    /**
     * Filled case
     */
    @Test
    public void testRectangleConstructorFilled()
    {
        Assert.assertTrue("Square fill incorrect.", s1.isFilled());
    }
    
    /**
     * Color
     */
    @Test
    public void testRectangleConstructorColor()
    {
        Color clr1 = s1.getColor();
        Color clr2 = s2.getColor();
        Assert.assertEquals("Square color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Square color incorrect.", Color.CYAN, clr2);
    }
    
}

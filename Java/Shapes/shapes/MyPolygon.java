import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyPolygon
{
    private int x1; // x coordinate of first endpoint
    private int y1; // y coordinate of first endpoint
    private int x2; // x coordinate of second endpoint
    private int y2; // y coordinate of second endpoint
    
    
    private Color myColor; // color of this shape
    private boolean filled;
    
   public MyPolygon()
    {
        this(0, 0, 0, 0, Color.BLACK, false); 
    }
    
    public MyPolygon(int x1, int y1, int x2, int y2, Color color, 
    boolean isFilled)
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setColor(color);
        setFilled(isFilled);
    }
    
    public void setX1(int x1)
    {
        this.x1 = (x1 >= 0 ? x1 : 0); // using ?: as if...else
    }
    
    public int getX1()
    {
        return x1;
    }
    
    public void setX2(int x2)
    {
        this.x2 = (x2 >= 0 ? x2 : 0); // using ?: as if...else
    }
    
    public int getX2()
    {
        return x2;
    }
    
    public void setY1(int y1)
    {
        this.y1 = (y1 >= 0 ? y1 : 0); // using ?: as if...else
    }
    
    public int getY1()
    {
        return y1;
    }
    
    public void setY2(int y2)
    {
        this.y2 = (y2 >= 0 ? y2 : 0); // using ?: as if...else
    }
    
    public int getY2()
    {
        return y2;
    }
    
    public void setColor(Color color)
    {
        myColor = color;
    }
    
    public Color getColor()
    {
        return myColor;
    }
    
    public int getUpperLeftX()
    {
        return Math.min(getX1(), getX2());
    }
    
    public int getUpperLeftY()
    {
        return Math.min(getY1(), getY2());
    }
    
    public int getWidth()
    {
        return Math.abs(getX2() - getX1());
    }
    
    public int getHeight()
    {
        return Math.abs(getY2() - getY1());
    }
    
    public boolean isFilled()
    {
        return filled;
    }
    
    public void setFilled(boolean isFilled)
    {
        filled = isFilled;
    }
    
    public void draw(GraphicsContext gc)
    {
        double a[] = {x1, x2, getHeight(), y1, y2, getWidth()};
        double b[] = {y2, getHeight(), y1, getWidth(), x1, x2};
        
        
        if (isFilled())
        {
            gc.setFill(getColor());
            gc.fillPolygon(a, b,
                6);
        }
        else
        {
            gc.setStroke(getColor());
            gc.strokePolygon(a, b,
                6);
        }
    }
}
            
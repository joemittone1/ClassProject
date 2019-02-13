//declaration of class MyLine
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine
{
    private int x1; // x coordinate of first endpoint
    private int y1; // y coordinate of first endpoint
    private int x2; // x coordinate of second endpoint
    private int y2; // y coordinate of second endpoint
    private Color myColor; // color of this shape
    
    //constructor initializes private variables with default values
    public MyLine()
    {
        this(0, 0, 0, 0, Color.BLACK); 
    }
    
    public MyLine(int x1, int y1, int x2, int y2, Color color)
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setColor(color);
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
    
    public void draw(GraphicsContext gc)
    {
        gc.setStroke(getColor());
        gc.strokeLine(getX1(), getY1(), getX2(), getY2());
    }
}
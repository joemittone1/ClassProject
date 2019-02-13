import java.security.SecureRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawRandomShapesController
{
    private static final SecureRandom randomNumbers = new SecureRandom();
    @FXML private Canvas canvas;
    
    @FXML
    void drawLinesButtonPressed(ActionEvent event)
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        MyLine[] lines = new MyLine[100];
        
        final int width = (int) canvas.getWidth();
        final int height = (int) canvas.getHeight();
        
        
        for (int count = 0; count < lines.length; count++)
        {
            int x1 = randomNumbers.nextInt(width);
            int y1 = randomNumbers.nextInt(height);
            int x2 = randomNumbers.nextInt(width);
            int y2 = randomNumbers.nextInt(height);
            
            Color color = Color.rgb(randomNumbers.nextInt(256),
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            lines[count] = new MyLine (x1, y1, x2, y2, color);
        }
        
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        for (MyLine line : lines)
        {
            line.draw(gc);
        }
        
    }
    
    @FXML
    void drawOvalsButtonPressed(ActionEvent event)
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        MyOval[] ovals = new MyOval[100];
        
        final int width = (int) canvas.getWidth();
        final int height = (int) canvas.getHeight();
        
        for (int count = 0; count < ovals.length; count++)
        {
            int x1 = randomNumbers.nextInt(width);
            int y1 = randomNumbers.nextInt(height);
            int x2 = randomNumbers.nextInt(width);
            int y2 = randomNumbers.nextInt(height);
            
            Color color = Color.rgb(randomNumbers.nextInt(256),
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            ovals[count] = new MyOval (x1, y1, x2, y2, color, 
            randomNumbers.nextBoolean());
        }
        
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        for (MyOval oval : ovals)
        {
            oval.draw(gc);
        }
        
    }
    @FXML
    void drawRectanglesButtonPressed(ActionEvent event)
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        MyRectangle[] rectangles = new MyRectangle[100];
        
        final int width = (int) canvas.getWidth();
        final int height = (int) canvas.getHeight();
        
        for (int count = 0; count < rectangles.length; count++)
        {
            int x1 = randomNumbers.nextInt(width);
            int y1 = randomNumbers.nextInt(height);
            int x2 = randomNumbers.nextInt(width);
            int y2 = randomNumbers.nextInt(height);
            
            Color color = Color.rgb(randomNumbers.nextInt(256),
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            rectangles[count] = new MyRectangle(x1, y1, x2, y2, color, 
            randomNumbers.nextBoolean());
        }
        
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        for (MyRectangle rectangle : rectangles)
        {
            rectangle.draw(gc);
        }
    }
    
    @FXML
    void drawPolygonsButtonPressed(ActionEvent event)
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        MyPolygon[] polygons = new MyPolygon[1];
        
        final int width = (int) canvas.getWidth();
        final int height = (int) canvas.getHeight();
        
        for (int count = 0; count < polygons.length; count++)
        {
            int x1 = randomNumbers.nextInt(width);
            int y1 = randomNumbers.nextInt(height);
            int x2 = randomNumbers.nextInt(width);
            int y2 = randomNumbers.nextInt(height);
            
            Color color = Color.rgb(randomNumbers.nextInt(256),
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            polygons[count] = new MyPolygon(x1, y1, x2, y2, color, 
            randomNumbers.nextBoolean());
        }
        
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        for (MyPolygon polygon : polygons)
        {
            polygon.draw(gc);
        }
    }
}
import java.applet.*;
import java.awt.*;
public class CO3pg4 extends Applet 
{
    public void paint(Graphics g)
    {
	g.setColor(Color.blue);
        g.fillOval(100, 0, 100, 100);

        g.setColor(Color.red);
        g.fillRect(100, 190, 170, 175);

        int xPoints[] = {250,320,170,250};
        int yPoints[] = {100,150,150,100};

        g.setColor(Color.green);
        g.fillPolygon(xPoints, yPoints, 3);
	
	g.setColor(Color.black);		
	g.drawLine(10,10,100,100);
			
			
			
    }
}

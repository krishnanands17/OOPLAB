import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class CO4pg3 extends Applet implements ActionListener
{
Button b1,b2;
Label bcolor;
String str;
public void init()
        {
            b1 = new Button("Red");    
            b2 = new Button("Blue");
             
            add(b1);                 
            add(b2);
 
            b1.addActionListener(this); 
            b2.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae)
        {
            str = ae.getActionCommand();
            repaint();      
        }
    public void paint(Graphics g)
    { 	
		setBackground(Color.pink);
		int [] x = {150, 300, 225};
		int [] y = {150, 150, 25};
		g.drawOval(200, 75, 50, 50);
		g.setColor(Color.gray);
        g.fillRect(150, 150, 150, 200);
        g.setColor(Color.blue);
        g.fillRect(190, 200, 80, 150);
        g.setColor(Color.darkGray);
        g.fillPolygon(x, y, 3);
        if(str.equals("Red"))
        {
			g.drawOval(200, 75, 50, 50);
            g.setColor(Color.gray);
            g.fillRect(150, 150, 150, 200);
            g.setColor(Color.red);
            g.fillRect(190, 200, 80, 150);
            g.setColor(Color.darkGray);
            g.fillPolygon(x, y, 3);
        }
        if(str.equals("Blue"))
        {
			g.drawOval(200, 75, 50, 50);
            g.setColor(Color.gray);
            g.fillRect(150, 150, 150, 200);
            g.setColor(Color.blue);
            g.fillRect(190, 200, 80, 150);
            g.setColor(Color.darkGray);
            g.fillPolygon(x, y, 3);
            
        }



    }
}
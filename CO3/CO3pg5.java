import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class CO3pg5 extends Applet implements MouseListener,MouseMotionListener
{
    int a=0;
    int b=0;
    String msg="";
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        a=200;
        b=400;
        msg="Mouse Clicked";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    {
        a=300;
        b=600;
        msg="Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        a=300;
        b=600;
        msg="Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        a=400;
        b=800;
        msg="Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        a=400;
        b=800;
        msg="Mouse Exited";
        repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
        a=me.getX();
        b=me.getY();
        showStatus("Currently mouse dragged "+a+" "+b);
        repaint(); }
    public void mouseMoved(MouseEvent me)
    {
        a=me.getX();
        b=me.getY();
        showStatus("Currently mouse is at "+a+" "+b);
        repaint();
    }
    public void paint(Graphics g)
    {

        setBackground(Color.cyan);
        g.setColor(Color.red);
        g.drawString("Handling Mouse Events",10,20);
        g.drawString(msg,600,400);
    }
}
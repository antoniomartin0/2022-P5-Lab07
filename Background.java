import java.awt.*;
import java.applet.*;

public class Background {

    public static void drawSand(Graphics g)
    {
        g.setColor(Color.orange);
        g.fillRect(0,375,1000,275);
    }
    public static void drawOcean(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRect(0,225,1000,150);
    }
    public static void drawSky(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(0,0,1000,225);
    }
    public static void drawStars(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(150,25,10,10);
        g.fillOval(250,50,10,10);
        g.fillOval(700,100,10,10);
        g.fillOval(500,150,10,10);
        g.fillOval(600,122,10,10);
        g.fillOval(250,133,10,10);
        g.fillOval(800,144,10,10);
        g.fillOval(550,111,10,10);
    }
}
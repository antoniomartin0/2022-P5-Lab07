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
}

import java.awt.*;
import java.applet.*;

public class Beach extends Applet{
    public void paint(Graphics g){

        Background.drawSand(g);
        Background.drawOcean(g);
        Background.drawSky(g);

        Moon.drawMoon(g);
        Moon.drawCraters(g);

        Stars.drawStars(g);
    }
}

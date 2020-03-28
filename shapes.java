import java.applet.*;
import java.awt.*;
public class shapes extends Applet
{
	int x[]={20,50,80};
	int y[]={80,20,80};
	public void init()
	{
		g.drawString("INIT");
	}
	public void start()
	{
		g.drawString("START");
	}
	public void paint(Graphics g)
	{
		//g.drawPolygon(x,y,3);
		//g.drawRect(20,80,60,40);
		/*g.drawOval(40,80,90,90);
		g.drawOval(45,120,10,10);
		g.drawOval(90,120,10,10);*/
		g.drawString("Tushti Gulati 1805173",40,40);
	}
	public void stop()
	{
		g.drawString("STOP");
	}
	
}

/*
<html>
<body>
<applet code ="shapes.class" width="100" height="100">
</applet>
</body>
</html>
*/
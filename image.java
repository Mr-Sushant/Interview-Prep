import java.applet.*;
import java.awt.*;
public class image extends Applet
{
	Image pic;
	public void init()
	{
		pic=getImage(getDocumentBase(),"comp.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(pic,50,50,this);
	}
}
/*
<html>
<body>
<applet code="image.class" width="1250" height="800">
</applet>
</body>
</html>
*/
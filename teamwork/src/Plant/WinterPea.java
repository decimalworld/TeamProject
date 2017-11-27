package Plant;
import GameObject.*;
import Script.BufferedImageLoader;
import Script.Game;
import Script.Handler;
import Script.SpriteSheet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class WinterPea extends Plant{

	private static int objNum;
	private BufferedImage snowpea_image;
	private long now=System.currentTimeMillis()-1000;
	
	public WinterPea(int x , int y){
		super((x-180)/r*r+180,(y-180)/r*r+180,5);
		setW(60);
		setH(80);
		slow=20;
		this.x=x;
		this.y=y;this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
		SpriteSheet ss=new SpriteSheet(Game.sprite_Sheet);
		snowpea_image=ss.grabImage(2,0,width,height);
	}
	
	public void tick(){
		if (System.currentTimeMillis()-now > 1000){
			Handler.addObject(new SnowPea(x,y));
			now=System.currentTimeMillis();
		}
		//x += velX;
		//y += velY;
	}
	public void render(Graphics g){
		//g.setColor(Color.blue);
		//g.fillRect(x+30, y, width, height);
		g.drawImage(snowpea_image, x+15, y, null);
	}
	public static int getObjNum() {
		return objNum;
	}

	public static void incObjNum( ) {
		objNum++;
	}
}

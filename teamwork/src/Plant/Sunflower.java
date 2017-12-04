package Plant;
import GameObject.*;
import Script.Game;
import Script.Handler;
import Script.SpriteSheet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sunflower extends Plant {
	private BufferedImage sunflo_image;
	private static int slot=1;
	private long now=System.currentTimeMillis();
	private static int objNum=0;
	
	public Sunflower(int x,int y){
		super((x-180)/r*r+180,(y-180)/r*r+180,5);
		setW(60);
		setH(80);
		this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
		SpriteSheet ss= new SpriteSheet(Game.sprite_Sheet);
		sunflo_image=ss.grabImage(1,0,width,height);
	}
	
	public void tick(){
		if (System.currentTimeMillis()-now>3500){
			Handler.addObject(new Sun(x-10,y-10));
			now = System.currentTimeMillis();
		}
	}
	
	public void render(Graphics g){
		//g.setColor(Color.yellow);
		//g.fillRect(x+30, y, width , height);
		g.drawImage(sunflo_image, x+15, y , null);
	}
	
	public static int getObjNum() {
		return objNum;
	}

	public static void incObjNum( ) {
		objNum++;
	}
}

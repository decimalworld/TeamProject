package Plant;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Script.Game;
import Script.Handler;
import Script.SpriteSheet;


public class Peashooter extends Plant{
	
	private static int slot=0;
	private BufferedImage norpea_image;
	static int objNum=0;
	private long now=System.currentTimeMillis()-1000;;
	
	public Peashooter(int x,int y){
		super((x-180)/r*r+180,(y-180)/r*r+180,5);
		setW(60);
		setH(80);
		slow=0;
		//where plant spawns, id, damage and health 
		this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
		SpriteSheet ss= new SpriteSheet(Game.sprite_Sheet);
		
		norpea_image=ss.grabImage(0,0,60,80);
	}
	
	
	
	public void render(Graphics g){
		//g.setColor(Color.green);
		//g.fillRect(x+30, y, width, height);
		g.drawImage(norpea_image, x+15, y, null);
	}
	
	public void tick(){
		if (System.currentTimeMillis()-now > 1000){
			Handler.addObject(new NormalPea(x,y));
			now=System.currentTimeMillis();
		}
		//x += velX;
		//y += velY;
	}
	public static int getObjNum() {
		return objNum;
	}

	public static void incObjNum( ) {
		objNum++;
	}
}

package Plant;
import GameObject.*;
import Script.Game;
import Script.SpriteSheet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Wallnut extends Plant {
	
	private static int objNum;
	private static int slot=2;
	private int hpregen=0;
	private BufferedImage wallnut_image;
	
	public Wallnut(int x,int y ){
		super((x-180)/r*r+180,(y-180)/r*r+180,50);
		setW(40);
		setH(60);
		this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
		SpriteSheet ss= new SpriteSheet(Game.sprite_Sheet);
		wallnut_image=ss.grabImage(3,0,60,80);
	}
	
	public void tick(){
		
	}

	public void render(Graphics g){
		g.drawImage(wallnut_image, x+15, y, null);
	}
	
	public static int getObjNum() {
		return objNum;
	}

	public static void incObjNum( ) {
		objNum++;
	}
}

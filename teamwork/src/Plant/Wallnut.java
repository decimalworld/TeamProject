package Plant;
import GameObject.*;
import Script.BufferedImageLoader;
import Script.Game;
import Script.Handler;
import Script.PlantInterface;
import Script.SpriteSheet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import GUI.Anou;
import GUI.ObjType;


public class Wallnut extends Plant implements PlantInterface {
	
	private static int sunCredit=50;
	private static long cdfrom=0;
	private int cd=5000;
	private static int objNum;
	private Utility utility = Utility.getInstance();
	
	public Wallnut(int x,int y ){
		super((x-180)/r*r+180,(y-180)/r*r+180,50);
		setW(40);
		setH(60);
		this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
		//SpriteSheet ss= new SpriteSheet(Game.sprite_Sheet);
		//wallnut_image=ss.grabImage(3,0,60,80);
	}
	
	public void tick(){
		cdfrom--;
	}
	

	public int getSunCredit() {
		return sunCredit;
	}

	public void render(Graphics g){
		utility.draw(ObjType.Wallnut, x, y, g);
	}
	
	public static int getObjNum() {
		return objNum;
	}

	public void incObjNum( ) {
		objNum++;
	}
	public void setOnCd(){
		cdfrom=System.currentTimeMillis();
	}
	@Override
	public long getCd() {
		return cdfrom;
		
	}
	@Override
	public long getUniqueCD() {
		// TODO Auto-generated method stub
		return cd;
	}
}

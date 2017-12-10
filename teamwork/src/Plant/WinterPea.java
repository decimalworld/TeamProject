package Plant;
import GameObject.*;
import Script.Game;
import Script.Handler;
import Script.PlantInterface;
import Script.SpriteSheet;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import GUI.ObjType;

public class WinterPea extends Plant implements PlantInterface{

	private static long cdfrom=0;
	private static int objNum;
	private int cd=2500;
	private static int sunCredit=175;
	private Utility utility=Utility.getInstance();
	private long now=System.currentTimeMillis()-1000;
	
	public WinterPea(int x , int y){
		super((x-180)/r*r+180,(y-180)/r*r+180,5);
		setW(60);
		setH(80);
		slow=20;
		this.x=x;
		this.y=y;this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
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
		utility.draw(ObjType.Winterpea, x, y, g);
	}
	public static int getObjNum() {
		return objNum;
	}

	public void incObjNum( ) {
		objNum++;
	}

	public int getSunCredit() {
		return sunCredit;
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

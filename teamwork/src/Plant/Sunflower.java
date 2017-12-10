package Plant;
import GameObject.*;
import Script.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import GUI.ObjType;

public class Sunflower extends Plant implements PlantInterface{
	private Utility utility = Utility.getInstance();
	private static long cdfrom=0;
	private static int sunCredit=50;
	private int cd=2000;
	private long now=System.currentTimeMillis();
	private static int objNum=0;
	
	public Sunflower(int x,int y){
		super((x-180)/r*r+180,(y-180)/r*r+180,5);
		setW(60);
		setH(80);
		this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
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
		utility.draw(ObjType.Sunflower, x, y, g);
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
	@Override
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

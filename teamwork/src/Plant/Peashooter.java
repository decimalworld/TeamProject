package Plant;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import GUI.ObjType;
import GameObject.Utility;
import Script.Handler;
import Script.PlantInterface;


public class Peashooter extends Plant implements PlantInterface{
	
	private static long cdfrom=0;
	private static int sunCredit=100;
	private int cd=1500;
	private Utility utility = Utility.getInstance();
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
	}

	public void render(Graphics g){
		//g.setColor(Color.green);
		//g.fillRect(x+30, y, width, height);
		utility.draw(ObjType.Peashooter, x, y, g);
	}
	
	public void tick(){
		cdfrom--;
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

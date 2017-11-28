package Plant;
import GameObject.*;
import Script.Handler;

import java.awt.Color;
import java.awt.Graphics;

public class Sunflower extends Plant {
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
		g.setColor(Color.yellow);
		g.fillRect(x+30, y, width , height);
	}
	
	public static int getObjNum() {
		return objNum;
	}

	public static void incObjNum( ) {
		objNum++;
	}
}

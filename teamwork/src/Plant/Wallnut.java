package Plant;

import java.awt.Color;
import java.awt.Graphics;


public class Wallnut extends Plant {
	
	private static int objNum;
	private static int slot=2;
	private int hpregen=0;
	
	public Wallnut(int x,int y ){
		super((x-180)/r*r+180,(y-180)/r*r+180,50);
		setW(40);
		setH(60);
		this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
	}
	
	public void tick(){
		
	}

	public void render(Graphics g){
		g.setColor(new Color(105,51,0));
		g.fillRect(x+30, y+20, width, height);
	}
	
	public static int getObjNum() {
		return objNum;
	}

	public static void incObjNum( ) {
		objNum++;
	}
}

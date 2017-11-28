package Plant;
import java.awt.Color;
import java.awt.Graphics;
import Script.Handler;


public class Peashooter extends Plant{
	
	static int objNum=0;
	private long now=System.currentTimeMillis()-1000;;
	
	public Peashooter(int x,int y){
		super((x-180)/r*r+180,(y-180)/r*r+180,5);
		setW(60);
		setH(80);
		slow=0; 
		this.x=(x-180)/r*r+180;
		this.y=(y-180)/r*r+180;
	}
	
	
	
	public void render(Graphics g){
		g.setColor(Color.green);
		g.fillRect(x+30, y, width, height);
	}
	
	public void tick(){
		if (System.currentTimeMillis()-now > 1000){
			Handler.addObject(new NormalPea(x,y));
			now=System.currentTimeMillis();
		}
	}
	public static int getObjNum() {
		return objNum;
	}

	public static void incObjNum( ) {
		objNum++;
	}
}

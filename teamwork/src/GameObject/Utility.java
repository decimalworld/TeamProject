package GameObject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import GUI.ObjType;
import Plant.Plant;
import Script.Game;
import Script.SpriteSheet;
import Zombie.Enemy;
import jdk.nashorn.internal.runtime.PrototypeObject;

public class Utility {
	private static Utility utility = null;
	
	private Utility() {
		
	}
	public static Utility getInstance(){
		if (utility == null){
			utility = new Utility();
		}
		return utility;
	}
	public boolean mouseOver (int mx,int my,int x,int y, int width , int height){
		if (mx>x && mx < x + width){
			if (my > y && my< y + height){
				return true;
			}
			else return false;
		}
		else return false;
	} 
	public void draw(ObjType obj,int x,int y,Graphics g){
		BufferedImage image=null;
		SpriteSheet ss= new SpriteSheet(Game.sprite_Sheet);
		if (obj==ObjType.Peashooter) {
			image=ss.grabImage(0,0,60,80);
		}
		if (obj==ObjType.Sunflower) {
			image=ss.grabImage(1,0,60,80);
		}
		if (obj==ObjType.Winterpea) {
			image=ss.grabImage(2,0,60,80);
		}
		if (obj==ObjType.Wallnut) {
			image=ss.grabImage(3,0,60,80);
		}
		if (obj==ObjType.Normal){
			image=ss.grabImage(0,1,60,80);
		}
		if (obj==ObjType.Buckethead) {
			image=ss.grabImage(2,1,60,80);
		}
		if (obj==ObjType.Conehead) {
			image=ss.grabImage(1,1,60,80);
		}
		if (obj==ObjType.FastZombie) {
			image=ss.grabImage(3,1,60,80);
		}
		if (obj==ObjType.PlayButton){
			image=ss.grabImage(0,2,200,64);
		}
		if (obj==ObjType.RetryButton){
			image=ss.grabImage(0,3,200,64);
		}
		if (obj==ObjType.ResumeButton){
			image=ss.grabImage(0,4,200,64);
		}
		if (obj==ObjType.PauseButton){
			image=ss.grabImage(0, 5, 100, 50);
		}
		g.drawImage(image, x+15, y, null);
	}
	public boolean checkNearby(Object objClass,GameObject obj ,int x, int y){
		if ( 	   (obj.getX()<x+10)
				&& (obj.getX()>=x)
				&& (obj.getY()>y-20) 
				&& (obj.getY()<y+50)){
			if ( (objClass==Object.Pea) && (obj instanceof Pea) ) return true;
			if ( (objClass==Object.Plant) && (obj instanceof Plant) ) return true;
			if ( (objClass==Object.Zombie) && (obj instanceof Enemy) ) return true;
		}
		return false;
			
	}
}

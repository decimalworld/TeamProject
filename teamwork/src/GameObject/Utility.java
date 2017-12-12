package GameObject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import GUI.ObjType;
import Plant.Plant;
import Script.Game;
import Script.SpriteSheet;
import Zombie.Enemy;

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
		
		if (image!=null) g.drawImage(image, x+15, y, null);
		else {
		if (obj==ObjType.RetryButton){
			ss = new SpriteSheet(Game.retry_button);
			image=ss.grabImage(0,0,200,64);
			g.drawImage(image,x,y,null);
			
		}
		if (obj==ObjType.ResumeButton){
			ss = new SpriteSheet(Game.resume_button);
			image=ss.grabImage(0,0,200,64);
			g.drawImage(image,x,y,null);
		}
		if (obj==ObjType.PauseButton){
			ss = new SpriteSheet(Game.pause_button);
			image=ss.grabImage(0, 0, 100, 50);
			g.drawImage(image,x,y,null);
		}
		}
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

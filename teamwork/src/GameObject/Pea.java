package GameObject;
import java.awt.Graphics;

import Script.Handler;
import Zombie.Enemy;


public class Pea extends GameObject {

	private Utility utility=Utility.getInstance();
	public Pea (int x, int y , int velX){
		super(x,y,1);
		//where bullet spawns, id, damage ( bullet that can penetrate has high health)
		this.velX=velX;
	}
	
	
	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public void render(Graphics g){
		
	}
	
	public void tick(){
		x+=velX;
		if (x>1000) Handler.removeObject(this);
		for (int i=0; i<Handler.object.size() ; i++){
			GameObject tempObject = Handler.object.get(i);
			if (utility.checkNearby(Object.Zombie, tempObject, this.x, this.y)){
				tempObject.setHealth(tempObject.getHealth()-this.damage);
				this.health--;
				if (this.health==0) Handler.removeObject(this);
			}
		}
	}
	
}

package GameObject;
import GameObject.*;

import java.awt.Graphics;

import GUI.ID;


public abstract class GameObject {
	
	protected int x , y;
	protected int damage;
	protected int health;
	protected int velX , velY;
	protected long last;
	protected int width,height;
	
	public GameObject ( int x, int y , int health ){
		this.x=x;
		this.y=y;
		this.health=health;
	}
	
	public void setW(int width){
		this.width=width;
	}
	
	public int getW(){
		return width;
	}
	
	public void setH(int height){
		this.height=height;
	}
	
	public int getH(){
		return height;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}
	
	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}	
}

package Plant;
import GameObject.*;
import Script.Handler;
import Script.PlantInterface;

import java.awt.Graphics;

public class Plant extends GameObject {
	protected static final int r=90;
	private int cd;
	protected int slow;
	protected int slot;
	
	
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public int getSlow() {
		return slow;
	}
	public Plant( int x, int y , int health ){
		super(x,y,health);
	}
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	public int getcd() {
		return cd;
	}
	public void setcd(int cd) {
		this.cd = cd;
	}
	@Override
	public void setY(int y) {
		this.y = (y-180)/r*r+180;
	}
	@Override
	public void setX(int x) {
		this.x = (x-180)/r*r+180;
	}
	public void placePlant(int x,int y){
		this.setX(x);
		this.setY(y);
		Handler.addObject(this);
		PlantInterface planted=(PlantInterface) this;
		planted.setOnCd();
		planted.incObjNum();
		Player.setSunCredit(Player.getSunCredit()-planted.getSunCredit());
	}
}

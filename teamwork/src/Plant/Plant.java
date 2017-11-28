package Plant;
import GameObject.*;

import java.awt.Graphics;

public class Plant extends GameObject {
	protected static final int r=90;
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
		

}

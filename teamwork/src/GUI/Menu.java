package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GameObject.Utility;


public class Menu extends MouseAdapter implements screenImp{
	private Utility utility = Utility.getInstance();
	public void mousePressed(MouseEvent e){
		int mx=e.getX();
		int my=e.getY();
		if (utility.mouseOver(mx,my,400,300,300,100) && State.getGameState()==ID.Menu){
			Anou.setAnou("Can you survive for 4 minutes");
			Victory.setStartTime(System.currentTimeMillis());
			State.setGameState(ID.Game);
		}
	}
	
	
	public void render(Graphics g){
		utility.draw(ObjType.PlayButton, 450-15, 300, g);
		Font fnt = new Font("arial",1,50);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Menu", 500, 50);
	}
}


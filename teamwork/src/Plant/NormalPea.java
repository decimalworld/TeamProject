package Plant;

import Script.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


import GameObject.Pea;
import Script.Game;

public class NormalPea extends Pea{
	
	
	public NormalPea(int x , int y ){
		super(x,y,5);
		this.damage=1;
		
	}
	

	public void render(Graphics g){
		g.setColor(Color.green);
		g.fillOval(x, y, 30, 20);
		
	}
}

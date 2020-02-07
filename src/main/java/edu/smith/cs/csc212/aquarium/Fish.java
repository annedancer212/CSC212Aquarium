package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	//Every fish has a x which is an int.
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	
	public Fish(Color c, int startX, int startY, boolean isLittle, boolean facingleft) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		
	}
	
	public void Swim() {
		this.swim();
		this.y += 1;
	}
	
	
	public void Draw(Graphics2D g) {
		if (isLittle) {
			if (facingLeft) {
				DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
			}
			DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		} else if(facingLeft) {
				DrawFish.facingLeft(g, this.color, this.x, this.y);
			}
			DrawFish.facingRight(g, this.color, this.x, this.y);
		
				
				
				
	}
}

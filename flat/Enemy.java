package flat;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Enemy extends GameObject {
	
	private static final Image IMG = 
		Toolkit.getDefaultToolkit().getImage("Empire.gif");
	
	public Enemy(Handler handler){
		super(handler, (int)(Math.random() * Game.WIDTH), Game.HEIGHT, null);
		setSpace(new Rectangle(getX(), getY(), 30, 30));
	}

	@Override
	public void tick() {
		setY(getY() - 3);
		setSpace(new Rectangle(getX(), getY(), 30, 30));
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(IMG, getX(), getY(), getX() + 30, getY() + 30, 
		363, 27, 393, 58, null);
	}

}

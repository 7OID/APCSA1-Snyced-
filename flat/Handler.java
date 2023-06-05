package flat;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Handler {
	
	private Player player;
	private ArrayList<Enemy> enemies;
	
	public Handler(){
		player = new Player(this);
		enemies = new ArrayList<Enemy>();
	}
	
	public void tick(){
		player.tick();
		if(Math.random() < 0.1)
			enemies.add(new Enemy(this));
		for(Enemy e : enemies)
			e.tick();
		for(int i = enemies.size() - 1; i >= 0; i--){
			if(enemies.get(i).getSpace().intersects(player.getSpace()))
				enemies.remove(i);
		}
	}
	
	
	public void render(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
		player.render(g);
		for(Enemy e : enemies)
			e.render(g);
	}

}

package flat;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas {
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 820;
	
	private Handler handler;
	
	public Game(){
		super();
		handler = new Handler();
		this.setFocusable(true);
		KeyInput keyInput = new KeyInput();
		MouseInput mouseInput = new MouseInput();
		this.addMouseListener(mouseInput);
		this.addKeyListener(keyInput);
		new Window(WIDTH, HEIGHT, "Tie Fighters", this);
	}
	
	
	public void run(){
		//MAIN GAME LOOP
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(true){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				delta--;
			}
			render();
			frames++;
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				//System.out.println("FPS: " + frames);
				frames = 0;
			}
		}	
	}
	
	
	private void tick(){
		handler.tick();
	}
	
	
	private void render(){
		BufferStrategy bfs = this.getBufferStrategy();
		if(bfs == null){
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bfs.getDrawGraphics();
		
		handler.render(g);
		
		g.dispose();
		bfs.show();
	}

}

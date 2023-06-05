package flat.Sounds;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	private boolean play = true;
	public Sound (){
	}

	public void playSound(){
		try{
			if(play)
			{
				File file = new File("02-opening-part-2-.wav");
				Clip clip = AudioSystem.getClip();
				AudioInputStream Audio = AudioSystem.getAudioInputStream(file);
				clip.open(Audio);
				
					clip.loop(clip.LOOP_CONTINUOUSLY);
				
				//Thread.sleep(400);
			
			} else {
				File file = new File("02-opening-part-2-.wav");
				Clip clip = AudioSystem.getClip();
				AudioInputStream Audio = AudioSystem.getAudioInputStream(file);
				clip.open(Audio);
				clip.loop(clip.LOOP_CONTINUOUSLY);
			}
		} catch (Exception e){
		}
	}

	public void setPlay(Boolean b){
		play = b;
	}
}
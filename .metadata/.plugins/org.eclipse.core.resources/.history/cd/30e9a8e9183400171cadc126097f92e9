package test;

import java.io.*;
import javax.sound.sampled.*;

public class Sound {
	
   public void movement(){
		try {
		    File movement = null;
		    AudioInputStream stream;
		    AudioFormat format;
		    DataLine.Info info;
		    Clip clip;
	
		    stream = AudioSystem.getAudioInputStream(movement);
		    format = stream.getFormat();
		    info = new DataLine.Info(Clip.class, format);
		    clip = (Clip) AudioSystem.getLine(info);
		    clip.open(stream);
		    clip.start();
		}
		catch (Exception e) {
		    //whatevers
		}
    }
}

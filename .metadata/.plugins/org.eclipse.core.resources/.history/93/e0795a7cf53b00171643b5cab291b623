package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Menu {  
	JFrame f;  
	Menu(){  
		  
		f=new JFrame();//creating instance of JFrame  
		try {
	         // Open an audio input stream.
	    	  File soundFile = new File("src/sound/void.wav");
	    	  AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	         clip.loop(Clip.LOOP_CONTINUOUSLY);
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
		JButton b=new JButton("Play Game");//creating instance of JButton  
		b.setBounds(140,120,200,40);  
		b.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	new Game();
		    	f.setVisible(false);

				@SuppressWarnings("unused")
				Music music = new Music();
				Music.main();

		  		
		    }
		});
		
		f.setContentPane(new JLabel (new ImageIcon("src/Images/background.jpg")));
		f.add(b);//adding button in JFrame  
		f.setSize(500,300);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		f.setLocationRelativeTo(null);
}  
  
	public static void main(String[] args) {  
		new Menu();  
	}  
}  

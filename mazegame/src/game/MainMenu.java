package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu {  
	JFrame f;  
	MainMenu(){  
		  
		f=new JFrame();//creating instance of JFrame  
		
		JButton b=new JButton("Play Game");//creating instance of JButton  
		b.setBounds(140,60,100,40);  
		b.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	@SuppressWarnings("unused")
				Game game = new Game();
	
		    	f.setVisible(false);

				@SuppressWarnings("unused")
				Music music = new Music();
				Music.main();

		  		
		    }
		});
		
		f.add(b);//adding button in JFrame  
		f.setSize(400,200);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		f.setLocationRelativeTo(null);
}  
  
	public static void main(String[] args) {  
		new MainMenu();  
	}

}  

package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu {  
	JFrame f;  
	Menu(){  
		f=new JFrame();//creating instance of JFrame  
		
		JButton b=new JButton("Play Game");//creating instance of JButton  
		b.setBounds(140,120,200,40);  
		b.addActionListener( new ActionListener()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	new Game();
		    	f.setVisible(false);
		    }
		});
		
		f.setContentPane(new JLabel (new ImageIcon("src/Images/background (1).jpg")));
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

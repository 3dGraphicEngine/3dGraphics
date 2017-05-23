package game;

import javax.swing.Action;

public class Clock {
    private int time = 0;
    public Action Tick()
    {
    	if (time  > 100000)
    	{
    		time++;
    		System.out.println(time);
    	}
		return null;
    }
}

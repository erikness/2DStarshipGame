package com.erikleeness.starship.input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import com.erikleeness.starship.routers.Router;

public class TimeInputChannel implements ActionListener
{
	private Router router;
	private Timer timer;
	private int msDelay;

	public TimeInputChannel(Router router, int msDelay)
	{
		this.router = router;
		timer = new Timer(msDelay, this);
	}

	/**
	 * Called when a timer event is fired.
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// do something that eventually sends signals to the router
		router.update(msDelay);
	}
	
	public void startTimer()
	{
		timer.start();
	}
	
	public void stopTimer()
	{
		timer.stop();
	}
	
	public void setDelay(int msDelay)
	{
		this.msDelay = msDelay;
	}

	
}

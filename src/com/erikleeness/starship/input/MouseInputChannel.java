package com.erikleeness.starship.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.erikleeness.starship.routers.Router;

public class MouseInputChannel implements MouseListener
{
	private Router router;
	
	public MouseInputChannel(Router router)
	{
		this.router = router;
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}	
}

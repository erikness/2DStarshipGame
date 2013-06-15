package com.erikleeness.starship.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.erikleeness.starship.routers.Router;
import com.erikleeness.starship.util.CardinalDirection;

public class KeyboardInputChannel implements KeyListener
{
	private Router router;
	
	public KeyboardInputChannel(Router router)
	{
		this.router = router;
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		switch (e.getKeyCode()) {
			
		case KeyEvent.VK_A:
			
			router.setPlayerDirection(CardinalDirection.WEST);
			break;
			
		case KeyEvent.VK_S:
			
			router.setPlayerDirection(CardinalDirection.SOUTH);
			break;
			
		case KeyEvent.VK_D:
			
			router.setPlayerDirection(CardinalDirection.EAST);
			break;
			
		case KeyEvent.VK_W:
			
			router.setPlayerDirection(CardinalDirection.NORTH);
			break;
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		switch(e.getKeyCode()) {
			
		case KeyEvent.VK_A:
		case KeyEvent.VK_S:
		case KeyEvent.VK_D:
		case KeyEvent.VK_W:
			router.stopPlayerMotion();
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	
}

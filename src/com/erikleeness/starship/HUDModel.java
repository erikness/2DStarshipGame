package com.erikleeness.starship;

import com.erikleeness.starship.routers.PlayerMotionListener;
import com.erikleeness.starship.routers.PlayerWeaponListener;
import com.erikleeness.starship.util.CardinalDirection;

public class HUDModel implements Updatable, PlayerMotionListener, PlayerWeaponListener
{
	private double temperature;
	private CardinalDirection radarDirection;
	
	public HUDModel()
	{
		temperature = 0;
		radarDirection = CardinalDirection.NORTH;
	}
	
	@Override
	public void firePlayerWeapon()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerDirection(CardinalDirection direction)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopPlayerMotion()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int msDelay)
	{
		// TODO Auto-generated method stub
		
	}

}

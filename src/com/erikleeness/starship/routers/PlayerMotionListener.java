package com.erikleeness.starship.routers;

import com.erikleeness.starship.util.CardinalDirection;

public interface PlayerMotionListener
{
	public void setPlayerDirection(CardinalDirection direction);
	
	public void stopPlayerMotion();
}

package com.erikleeness.starship.routers;

import com.erikleeness.starship.Updatable;
import com.erikleeness.starship.util.CardinalDirection;

public interface Router
{
	public void setPlayerDirection(CardinalDirection direction);
	public void stopPlayerMotion();
	public void firePlayerWeapon();
	public void update(int msDelay);

	public void registerUpdateRoute(Updatable route);
	public void registerPlayerMotionRoute(PlayerMotionListener route);
	public void registerPlayerWeaponRoute(PlayerWeaponListener route);

}

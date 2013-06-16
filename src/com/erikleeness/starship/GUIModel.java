package com.erikleeness.starship;

import java.util.List;

import com.erikleeness.starship.models.ObstacleModel;
import com.erikleeness.starship.models.StarshipModel;
import com.erikleeness.starship.models.WeaponBlastModel;
import com.erikleeness.starship.routers.PlayerMotionListener;
import com.erikleeness.starship.routers.PlayerWeaponListener;
import com.erikleeness.starship.util.CardinalDirection;

public class GUIModel implements Updatable, PlayerMotionListener, PlayerWeaponListener
{
	private StarshipModel playerShip;
	private List<StarshipModel> enemyShips;
	private List<ObstacleModel> obstacles;
	private List<WeaponBlastModel> weaponBlasts;
	
	private long msAtLastUpdate;
	
	/**
	 * Don't use this directly. It is valid, but one can also have much cleaner
	 * code by using a GUIModelBuilder.
	 * 
	 * @param playerShip		the protagonists's ship
	 * @param enemyShips		a list of enemy ships to start with
	 * @param obstacles			a list of obstacles to start with
	 * @param weaponBlasts		a list of weapon blasts to start with
	 */
	public GUIModel(StarshipModel playerShip, List<StarshipModel> enemyShips,
			List<ObstacleModel> obstacles, List<WeaponBlastModel> weaponBlasts)
	{
		this.msAtLastUpdate = System.currentTimeMillis();
		
		this.playerShip = playerShip;
		this.enemyShips = enemyShips;
		this.obstacles = obstacles;
		this.weaponBlasts = weaponBlasts;
	}
	
	
	/**
	 * Called when calculating how far to move objects
	 * This is used instead of assuming that updates happen
	 * at a fixed time interval (like 60hz)
	 */
	public int msSinceLastUpdate()
	{
		/* We really don't expect it to have been over
		 * 2 billion ms since the last update */
		return (int) (System.currentTimeMillis() - msAtLastUpdate);
	}

	@Override
	public void update(int msDelay)
	{
		msAtLastUpdate = System.currentTimeMillis();
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
}

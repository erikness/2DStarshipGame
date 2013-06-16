package com.erikleeness.starship.routers;

import java.util.LinkedList;
import java.util.List;

import com.erikleeness.starship.GUIModel;
import com.erikleeness.starship.Updatable;
import com.erikleeness.starship.input.KeyboardInputChannel;
import com.erikleeness.starship.input.TimeInputChannel;
import com.erikleeness.starship.util.CardinalDirection;

/**
 * Supports 4 routes:
 * - Update, called when a timer demands that components update themselves
 * - Set player direction
 * - Stop player motion
 * - Fire player weapon
 * @author erik
 *
 */
public class ControlRouter implements Router
{	
	private List<Updatable> updateRoutes;
	private List<PlayerMotionListener> playerMotionRoutes;
	private List<PlayerWeaponListener> playerWeaponRoutes;
	
	/**
	 * 
	 * @param guiModel
	 * Model that this router sends messages to
	 */
	public ControlRouter()
	{
		this.updateRoutes = new LinkedList<Updatable>();
		this.playerMotionRoutes = new LinkedList<PlayerMotionListener>();
		this.playerWeaponRoutes = new LinkedList<PlayerWeaponListener>();
	}
	
	@Override
	public void registerUpdateRoute(Updatable route)
	{
		updateRoutes.add(route);
	}
	
	@Override
	public void registerPlayerMotionRoute(PlayerMotionListener route)
	{
		playerMotionRoutes.add(route);
	}
	
	@Override
	public void registerPlayerWeaponRoute(PlayerWeaponListener route)
	{
		playerWeaponRoutes.add(route);
	}
	
	/**
	 * Typically called by {@link KeyboardInputChannel}
	 * 
	 * @param direction
	 */
	@Override
	public void setPlayerDirection(CardinalDirection direction)
	{
		for (PlayerMotionListener listener : playerMotionRoutes) {
			listener.setPlayerDirection(direction);
		}
	}
	
	/**
	 * Typically called by {@link KeyboardInputChannel}
	 * 
	 * @param direction
	 */
	@Override
	public void stopPlayerMotion()
	{
		for (PlayerMotionListener listener : playerMotionRoutes) {
			listener.stopPlayerMotion();
		}
	}
	
	/**
	 * Typically called by {@link KeyboardInputChannel}
	 */
	@Override
	public void firePlayerWeapon()
	{
		for (PlayerWeaponListener listener : playerWeaponRoutes) {
			listener.firePlayerWeapon();
		}
	}
	
	/**
	 * Typically called by a {@link TimeInputChannel}
	 */
	@Override
	public void update(int msDelay)
	{
		for (Updatable route : updateRoutes) {
			route.update(msDelay);
		}
	}
	
}

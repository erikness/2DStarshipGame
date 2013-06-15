package com.erikleeness.starship.routers;

import java.util.LinkedList;
import java.util.List;

import com.erikleeness.starship.GUIModel;
import com.erikleeness.starship.Updatable;
import com.erikleeness.starship.input.KeyboardInputChannel;
import com.erikleeness.starship.input.TimeInputChannel;
import com.erikleeness.starship.util.CardinalDirection;

public class ControlRouter implements Router
{	
	private List<Updatable> routes;
	
	/**
	 * 
	 * @param guiModel
	 * Model that this router sends messages to
	 */
	public ControlRouter()
	{
		this.routes = new LinkedList<Updatable>();
	}
	
	@Override
	public void registerUpdateRoute(Updatable route)
	{
		routes.add(route);
	}
	
	/**
	 * Typically called by {@link KeyboardInputChannel}
	 * 
	 * @param direction
	 */
	@Override
	public void setPlayerDirection(CardinalDirection direction)
	{
		
	}
	
	/**
	 * Typically called by {@link KeyboardInputChannel}
	 * 
	 * @param direction
	 */
	@Override
	public void stopPlayerMotion()
	{
		
	}
	
	/**
	 * Typically called by {@link KeyboardInputChannel}
	 */
	@Override
	public void firePlayerWeapon()
	{
		
	}
	
	/**
	 * Typically called by a {@link TimeInputChannel}
	 */
	@Override
	public void update(int msDelay)
	{
		for (Updatable route : routes) {
			route.update(msDelay);
		}
	}
	
}

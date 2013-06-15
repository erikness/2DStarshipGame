package com.erikleeness.starship.builders;

import java.util.LinkedList;
import java.util.List;

import com.erikleeness.starship.GUIModel;
import com.erikleeness.starship.models.ObstacleModel;
import com.erikleeness.starship.models.StarshipModel;
import com.erikleeness.starship.models.WeaponBlastModel;

public class GUIModelBuilder
{
	private StarshipModel playerShip;
	private List<StarshipModel> enemyShips;
	private List<ObstacleModel> obstacles;
	private List<WeaponBlastModel> weaponBlasts;
	
	public GUIModelBuilder()
	{
		enemyShips = new LinkedList<StarshipModel>();
		obstacles = new LinkedList<ObstacleModel>();
		weaponBlasts = new LinkedList<WeaponBlastModel>();
	}
	
	public GUIModelBuilder withEnemyShip(StarshipModel enemy)
	{
		this.enemyShips.add(enemy);
		return this;
	}
	
	public GUIModelBuilder withObstacle(ObstacleModel obstacle)
	{
		this.obstacles.add(obstacle);
		return this;
	}
	
	public GUIModelBuilder withWeaponBlast(WeaponBlastModel weaponBlast)
	{
		this.weaponBlasts.add(weaponBlast);
		return this;
	}
	
	public GUIModelBuilder setPlayer(StarshipModel player)
	{
		this.playerShip = player;
		return this;
	}
	
	public GUIModel build()
	{
		// We can have empty lists, but not an empty ship!
		if (playerShip == null) {
			throw new IllegalArgumentException("You must specify the model for the player's ship.");
		}
		
		return new GUIModel(playerShip, enemyShips, obstacles, weaponBlasts);
	}
}

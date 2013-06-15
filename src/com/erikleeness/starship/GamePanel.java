package com.erikleeness.starship;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Represents the starship area of the game.
 * Does not include controls.
 * 
 * @author erik
 *
 */
public class GamePanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private GUIModel guiModel;
	
	public GamePanel(GUIModel guiModel)
	{
		this.guiModel = guiModel;
	}
	
	public void paintComponent(Graphics graphics)
	{
		paintBackground(graphics);
		paintStarships(graphics);
		paintObstacles(graphics);
		paintWeapons(graphics);
	}
	
	private void paintWeapons(Graphics graphics)
	{
		// TODO Auto-generated method stub
		
	}

	private void paintObstacles(Graphics graphics)
	{
		// TODO Auto-generated method stub
		
	}

	private void paintStarships(Graphics graphics)
	{
		// TODO Auto-generated method stub
		
	}

	private void paintBackground(Graphics graphics)
	{
		// TODO
	}
	
	
}

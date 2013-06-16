package com.erikleeness.starship;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.erikleeness.starship.routers.PlayerMotionListener;
import com.erikleeness.starship.routers.PlayerWeaponListener;

public class HUDPanel extends JPanel implements Updatable
{
	private static final long serialVersionUID = 1L;
	private GUIModel guiModel;
	
	public HUDPanel(GUIModel guiModel)
	{
		this.guiModel = guiModel;
	}
	
	public void paintComponent(Graphics graphics)
	{
		paintRadar(graphics);
		paintVitals(graphics);
	}
	
	public void paintRadar(Graphics graphics)
	{
		// TODO
	}
	
	public void paintVitals(Graphics graphics)
	{
		// TODO
	}

	@Override
	public void update(int msDelay)
	{
		this.repaint();
	}
}

package com.erikleeness.starship;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.erikleeness.starship.builders.GUIModelBuilder;
import com.erikleeness.starship.input.MouseInputChannel;
import com.erikleeness.starship.input.TimeInputChannel;
import com.erikleeness.starship.models.StarshipModel;
import com.erikleeness.starship.models.StarshipType;
import com.erikleeness.starship.routers.ControlRouter;
import com.erikleeness.starship.routers.Router;
import com.erikleeness.starship.util.CardinalDirection;
import com.erikleeness.starship.util.Speed;

public class StarshipGame
{
	private GUIModel guiModel;
	private JFrame frame;
	private JPanel gamePanel;
	
	private TimeInputChannel timerInput;
	private MouseInputChannel mouseInput;
	private Router router;
	
	// Constants. Will make them into a db / text file later
	private final Dimension GUI_SIZE = new Dimension(500, 500);
	
	public static void main(String[] args)
	{
		StarshipGame game = new StarshipGameBuilder()
				.build();
		game.init();
		game.start();
	}
	
	public StarshipGame()
	{
		
	}
	
	public void init()
	{
		guiModel = new GUIModelBuilder()
			.setPlayer(new StarshipModel(
					CardinalDirection.NORTH, Speed.inPixels(0), StarshipType.ENTERPRISE))
			.withEnemyShip(new StarshipModel(
					CardinalDirection.EAST, Speed.inPixels(50), StarshipType.EBON_HAWK))
			.withEnemyShip(new StarshipModel(
					CardinalDirection.WEST, Speed.inPixels(30), StarshipType.FALCON))
			.build();
		
		initWindow();
	}
	
	public void initWindow()
	{
		frame = new JFrame();
		gamePanel = new GamePanel(guiModel);
		gamePanel.setPreferredSize(GUI_SIZE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
	public void initInputs()
	{
		// 25 ms <==> 40 hz
		router = new ControlRouter();
		router.registerUpdateRoute(guiModel);
		
		timerInput = new TimeInputChannel(router, 25);
		mouseInput = new MouseInputChannel(router);
	}
	
	public void start()
	{
		frame.setVisible(true);
		timerInput.startTimer();
	}
}

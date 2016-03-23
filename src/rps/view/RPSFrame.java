package rps.view;

import javax.swing.JFrame;
import rps.controller.RPSController;

public class RPSFrame extends JFrame
{
	private RPSController baseController;
	private RPSPanel basePanel;
	
	public RPSFrame(RPSController baseController)
	{
		this.baseController = baseController;
		basePanel = new RPSPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("RPS-RPG");
		this.setSize(600,420);
		this.setVisible(true);
	}
	
	public RPSController getBaseController()
	{
		return baseController;
	}
}

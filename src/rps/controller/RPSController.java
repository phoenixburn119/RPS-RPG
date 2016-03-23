package rps.controller;

import rps.model.RPS;
import rps.view.RPSFrame;

public class RPSController
{
	private RPS RPS;
	private RPSFrame baseFrame;

	
	public RPSController()
	{
		baseFrame = new RPSFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public int calculatedAnswer()
	{
		return RPS.computeRPS();
	}
}

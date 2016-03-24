package rps.controller;

import rps.model.RPS;
import rps.view.RPSFrame;

public class RPSController
{
	private RPS RPS;
	private RPSFrame baseFrame;

	
	public RPSController()
	{
		RPS = new RPS();
		baseFrame = new RPSFrame(this);
		
	}
	
	public String calculatedAnswer(int answer)
	{
		return RPS.computeRPS(answer);
	}
}

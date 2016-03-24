package rps.model;

public class RPS
{
	private String player1;
	
	public RPS()
	{
		this.player1 = new String("");
		
		
	}
			// 0=rock 1=paper 2=scissor
	public String computeRPS(int answer)
	{
		String computeRPS = "";
		int botAnswer = computerRandom();
		
		if(answer == 0 && botAnswer == 0)
		{
			computeRPS = "It's a tie";
		}
		else if(answer == 0 && botAnswer == 1)
		{
			computeRPS = "Bot wins";
		}
		else if(answer == 0 && botAnswer == 2)
		{
			computeRPS = "Player wins";
		}
		else if(answer == 1 && botAnswer == 0)
		{
			computeRPS = "Player wins";
		}
		else if(answer == 1 && botAnswer == 1)
		{
			computeRPS = "It's a tie";
		}
		else if(answer == 1 && botAnswer == 2)
		{
			computeRPS = "Bot wins";
		}
		else if(answer == 2 && botAnswer == 0)
		{
			computeRPS = "Bot wins";
		}
		else if(answer == 2 && botAnswer == 1)
		{
			computeRPS = "Player wins";
		}
		else if(answer == 2 && botAnswer == 2)
		{
			computeRPS = "It's a tie";
		}
		
		return computeRPS;
	}
	
	private int computerRandom()
	{
		int compAnswer = (int) (Math.random()*3);
		return compAnswer;
	}
}

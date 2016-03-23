package rps.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import rps.controller.RPSController;

public class RPSPanel extends JPanel
{
	private RPSController baseController;
	private SpringLayout baseLayout;
	private JLabel player1;
	private JButton p1R;
	private JButton p1P;
	private JButton p1S;
	private JLabel player2;
	private JButton p2R;
	private JButton p2P;
	private JButton p2S;
	private JLabel computer;
	
	public RPSPanel(RPSController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		player1 = new JLabel("Player 1");
		baseLayout.putConstraint(SpringLayout.WEST, player1, 96, SpringLayout.WEST, this);
		p1R = new JButton("Rock");
		p1P = new JButton("Paper");
		baseLayout.putConstraint(SpringLayout.SOUTH, player1, -6, SpringLayout.NORTH, p1P);
		p1S = new JButton("Scissor");
		player2 = new JLabel("Player 2");
		p2R = new JButton("Rock");
		p2P = new JButton("Paper");
		p2S = new JButton("Scissor");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(player1);
		this.add(p1R);
		this.add(p1P);
		this.add(p1S);
		this.add(player2);
		this.add(p2R);
		this.add(p2P);
		this.add(p2S);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, p1R, 69, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, p1R, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, p1P, 0, SpringLayout.NORTH, p1R);
		baseLayout.putConstraint(SpringLayout.WEST, p1P, -2, SpringLayout.EAST, p1R);
		baseLayout.putConstraint(SpringLayout.NORTH, p1S, 0, SpringLayout.NORTH, p1R);
		baseLayout.putConstraint(SpringLayout.WEST, p1S, -2, SpringLayout.EAST, p1P);
		baseLayout.putConstraint(SpringLayout.SOUTH, player2, 60, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, player2, -111, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, p2R, 0, SpringLayout.NORTH, p1R);
		baseLayout.putConstraint(SpringLayout.WEST, p2R, 104, SpringLayout.EAST, p1S);
		baseLayout.putConstraint(SpringLayout.EAST, p2R, 2, SpringLayout.WEST, p2P);
		baseLayout.putConstraint(SpringLayout.NORTH, p2P, 69, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, p2P, 2, SpringLayout.WEST, p2S);
		baseLayout.putConstraint(SpringLayout.NORTH, p2S, 0, SpringLayout.NORTH, p1R);
		baseLayout.putConstraint(SpringLayout.EAST, p2S, -10, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}

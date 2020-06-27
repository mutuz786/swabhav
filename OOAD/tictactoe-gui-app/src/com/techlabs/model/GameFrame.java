package com.techlabs.model;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import Board.*;

public class GameFrame implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel(new GridLayout(4, 3));
	JLabel status = new JLabel("Status:");
	JLabel CurrentPlayer = new JLabel("CurrentPlayer:");
	JLabel winner = new JLabel();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	String player1;
	NameFrame nframe;
	Board board;
	Game game;

	public GameFrame(NameFrame nframe) {
		this.nframe = nframe;
		panel1.add(status);
		panel1.add(CurrentPlayer);
		panel1.add(winner);
		panel1.setLocation(0, 200);
		for (int i = 0; i < 9; i++) {
			buttons.add(new JButton(i + ""));
			panel1.add(buttons.get(i));
			buttons.get(i).addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Done") {
			board = new Board();
			ArrayList<Player> players = new ArrayList<Player>(2);
			players.add(new Player(nframe.getplayer1(), Mark.X));
			players.add(new Player(nframe.getplayer2(), Mark.O));
			game = new Game(players, board, new ResultAnalyzer(board));
			setStatus();
			setCurrentPlayer();
			player1 = game.getCurrentPlayer().getName();
			frame.add(panel1);
			frame.add(panel1);
			frame.setVisible(true);
			frame.setSize(500, 500);
			return;
		}
		int location = Integer.parseInt(e.getActionCommand());
		game.play(location);
		buttons.get(location).addActionListener(null);
		setStatus();
		setCurrentPlayer();
		setWinner();
		buttons.get(location).setText(game.getValidSymbol());
	}

	private void setWinner() {
		if (game.getStatus() == 1) {
			winner.setText("Winner: " + game.getCurrentPlayer().getName());
		}
	}

	private void setCurrentPlayer() {
		CurrentPlayer.setText("Current Player: " + game.getCurrentPlayer().getName());
	}

	private void setStatus() {
		String text = "status: ";
		switch (game.getStatus()) {
		case 0:
			status.setText(text + "Progress");
			break;
		case 1:
			status.setText(text + "Win");
			break;
		case 2:
			status.setText(text + "Draw");
			break;
		default:
			break;
		}

	}

}

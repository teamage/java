package game;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mines extends JFrame {
	private final int WIDTH = 210;
	private final int HEIGHT = 250;

	private JLabel statusbar;

	public Mines() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setTitle("Minesweeper");

		statusbar = new JLabel("");
		add(statusbar, BorderLayout.SOUTH);

		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Mines();
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Launchpage implements ActionListener {
private static final int EXIT_ON_CLOSE = 0;
JFrame frame = new JFrame();
JButton snakebutton = new JButton("Snake");
JButton pinball = new JButton("Pin Ball");
JButton tictac = new JButton("Tic Tac Toe");

Launchpage()
{
	snakebutton.setBounds(0,50,200,500);
	snakebutton.setFocusable(true);
	snakebutton.addActionListener(this);
	pinball.setBounds(200,50,200,500);
	pinball.setFocusable(true);
	pinball.addActionListener(this);
	tictac.setBounds(400,50,200,500);
	tictac.setFocusable(true);
	tictac.addActionListener(this);
	
	frame.setTitle("Launch");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	frame.setSize(600,600);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	frame.add(snakebutton);
	frame.add(pinball);
	frame.add(tictac);

}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==snakebutton)
	{
		frame.dispose();
		 gameframe game1 = new gameframe();
	}
	else if(e.getSource()==tictac)
	{
		frame.dispose();
		tictactoe tic = new tictactoe();
	}
	
}
}
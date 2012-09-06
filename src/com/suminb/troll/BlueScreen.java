package com.suminb.troll;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BlueScreen extends JFrame {

	/**
	 * Auto-generated serial UID
	 */
	private static final long serialVersionUID = -2117300000302538822L;
	
	private JTextArea textArea = new JTextArea();

	public BlueScreen(String text) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(0, 0, screenSize.width, screenSize.height);
	    setUndecorated(true);
	    
	    Font font = new Font("Monospace", Font.BOLD, 14);
	    
	    textArea.setFont(font);
		textArea.setMargin(new Insets(20, 20, 20, 20));
	    textArea.setForeground(Color.WHITE);
	    textArea.setBackground(Color.BLUE);
	    textArea.setText(text);
	    add(textArea);
	}
}

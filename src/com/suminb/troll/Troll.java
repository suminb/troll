package com.suminb.troll;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

public class Troll extends JFrame {

	/**
	 * Auto-generated serial UID
	 */
	private static final long serialVersionUID = 948955313795710559L;
	
	private void init() throws IOException {
		char[] buf = new char[4092];
	    FileReader reader = new FileReader("message.txt");
	    int read = reader.read(buf);
	    
		BlueScreen bs = new BlueScreen(new String(buf, 0, read));
		bs.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new Troll().init();
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

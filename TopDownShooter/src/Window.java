import java.awt.Dimension;

import javax.swing.JFrame;

//call right off the bat to make the window
public class Window {

	public Window(int width, int height, String title, Game game){
		
		JFrame frame = new JFrame(title); //hovered over jframe to import it (jframe is like a window)
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		frame.add(game);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
}

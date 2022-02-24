//************ Total Marks for correctness: 10 marks
import javax.swing.JFrame;

public class Main {	
	/*
	 * Main method that instantiates the main Jrame and adds the SurfacePanelf or rendering the dots
	 */
	public static void main(String[] args) {			
		JFrame main = new JFrame("Painting canvas with undo");
		main.setSize(640,480);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setVisible(true);
		SurfacePanel panel = new SurfacePanel();
		main.add(panel);
		main.addMouseMotionListener(panel);
		main.addMouseListener(panel);
		main.addKeyListener(panel);
		main.setExtendedState(main.getExtendedState()| JFrame.MAXIMIZED_BOTH);
	}

}

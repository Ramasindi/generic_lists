//************ Total Marks for SurfacePanel class: 15 marks
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SurfacePanel extends JPanel implements MouseMotionListener, MouseListener, KeyListener{
	private Stack<PolyLine> renderStack;
	private PolyLine currentLine;	
	
	/*
	 * The default constructor
	 */
	public SurfacePanel(){		
		renderStack = new Stack<PolyLine>();
		currentLine = new PolyLine(1000);		
	}
	
	
	/*
	 * The overridden paintComponent method for rendering the current lines 
	 * ********** 8 marks ****************************
	 */
	public void paintComponent(Graphics g){		
		//COMPLETE CODE HERE
	}

	
/*
 * The keyPressed handler that implements the undo for drawing the last line
 * ********** 5 marks ****************************
 */
	@Override
	public void keyPressed(KeyEvent arg0) {
		//COMPLETE CODE HERE
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
	/*
	 * The overridden mouseDragged handler to add coordinates for rendering
	 * 
	 */
	@Override
	public void mouseDragged(MouseEvent arg0) {		
		System.out.println("Mouse dragged "+ arg0.getX()+" "+arg0.getY());
		currentLine.addCoordinate(arg0.getX(),arg0.getY());	
		repaint();
	}
	/*
	 * The mouse released method that indicates the end of a stroke
	 * ********** 2 marks ****************************
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		//COMPLETE CODE HERE	
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}
	
}

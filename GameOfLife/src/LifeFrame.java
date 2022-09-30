//An extended version of java.awt.Frame that adds support for the JFC/Swing component architecture:
//JFrama -> the frame of the canvas
//you always need it to be able to show stuff
import javax.swing.JFrame;

public class LifeFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public LifeFrame() {
		add(new LifePanel());
		
		//setting the size: width=700; height=1300
		setSize (1300, 700);
		
		//we want to see the board, so we set it to visible - true:
		setVisible (true); 
		
		//setting default: when we close our program, all things shut down:
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
	}

	
	public static void main(String[] args) {
		new LifeFrame();
	}
}

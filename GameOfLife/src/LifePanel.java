import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;  
//graphics
//event is an abstract class
//it will allow us to animate the panel
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//adding abstract classes for the mouse, so we can draw
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//adding input from the keyboard
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//saving and getting progress
import java.io.BufferedReader;
import java.io.FileReader;
//libraries for the image
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class LifePanel extends JPanel implements 
                       ActionListener, MouseListener, MouseMotionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	//dimensions of the panel:
	      //x is width:
	int xPanel = 1300;
	      //y is height:
	int yPanel = 700;
	      //the size of the squares in pixels:
	int size = 7;
         //new variables that we are going to use in the check():
    int xWidth = xPanel/size;
    int yHeight = yPanel/size;
	      //creating a boolean array, because our squares will either be true(alive) or false(dead):
	      //xPanel/size gives us the number of squares:
	      //rewriting it as an integer array, because we can't use addition to a boolean
	int[][] life = new int[xWidth][yHeight];
	      //adding another array and set it equal to 1 later in a method
	int[][] beforeLife = new int[xWidth][yHeight];
	      //at the start of the program, all equals true
	boolean starts = true;
	      //indicates if the mouse is clicked
	int initial = -1;
	     //new timer:
	Timer time;
	int timeInput = 0;
         //creating a file for the progress and a bufferedWriter to write inside the file
	BufferedWriter writer;
	FileWriter file;
	//scanner to read back in the progress
	Scanner sc;
	Scanner input = new Scanner(System.in);
	File filename = new File("progress.bin");;
	BufferedReader reader;
	FileReader fileReader;
	{try {
		file = new FileWriter(filename, true);   // true = append, false = overwrite
		writer = new BufferedWriter(file);
		fileReader = new FileReader(filename);
		reader = new BufferedReader(fileReader);
		sc = new Scanner(fileReader);

	}catch (FileNotFoundException e) {}
	catch(IOException e){ }
	}   
			
 
	
	//creating the panel:
	public LifePanel() {
		setSize (xPanel, yPanel);		
     		//absolute positioning - you have to do all the work in your code
		setLayout(null);	
		
		//adding the movement for the mouse:
		addMouseMotionListener(this);
		addMouseListener(this);
		
		addKeyListener(this);
		setFocusable(true);
		
	    	//setting the background color:
		setBackground(Color.BLACK);
		
		    //adding frame rate:
		inputTime(input);
		if(timeInput == 0 || timeInput <= 0) {
			time = new Timer(80, this);    //default
		}else if(timeInput >= 0){
			time = new Timer(timeInput, this);
		}
		
	}

    

	public int getTimeInput() {
		return timeInput;
	}
	public void setTimeInput(int timeInput) {
		this.timeInput = timeInput;
	}




	//calling the creation methods for the elements
	public void paintComponent (Graphics g) {
		     //we are calling the super to the Graphics class:
		     //it refreshes and shows the current position, thus it doesn't lag
		super.paintComponent(g);
		     //calling the method for creating the grid
		grid(g);
		     //calling the methods for the squares:
		display(g);
	}
	
	
	
	
	//creating a grid of grey lines
	private void grid(Graphics g) {
		      //grey color for the lines
		g.setColor(Color.DARK_GRAY);
		   //we are not using double loop, because it reduces the runtime
		for(int i=0; i<life.length; i++) {
			       //drawing the horizontal and vertical grey lines on the panel:
			g.drawLine(0, i*size, xPanel, i*size);  //row
			g.drawLine(i*size, 0, i*size, yPanel);  //columns
		}
	}
	
	
	
	
	
	//making the squares:
	private void spawn() {
			//essentially what we are doing is choosing random squares to be alive 
			for (int x=0; x<life.length; x++) {
				for (int y=0; y<(yHeight); y++) {
					//now we add the density of the alive squares
					//the number we multiply dictates the density
					//smaller number would mean more alive squares, so 5 should be fine
					if ((int)(Math.random()*5) == 0) {
						beforeLife[x][y] = 1;
					}
				}
			}
	}
	
	
	
	
	//displaying the squares
	private void display(Graphics g) {
		//choosing color:
		g.setColor(Color.MAGENTA);
		
		copyArray();
		
		//we are going through every array index 
		for (int x = 0; x < life.length; x++) {
			//yPanel/size gives us the number of squares vertically
			for (int y = 0; y < (yHeight); y++) {
				//and if that spot is on(=1), we want to display a color filled cell
				if (life[x][y] == 1) {
					//coloring the cells
					g.fillRect(x * size, y * size, size, size);
				}
			}
		}
	}
	
	
	
	
	
	// this method we will use later in the actionPerformed method
	// we are coping one array to another
	private void copyArray() {
		for (int x = 0; x < life.length; x++) {
			// yPanel/size gives us the number of squares vertically
			for (int y = 0; y < (yHeight); y++) {
				// we want our current array to be updated by the previous one
				life[x][y] = beforeLife[x][y];

			}
		}
	}
	
	
	
	
	//algorithm:
	//x and y are the positions of the cell
	//this method checks every one of the 8 neighbors of a given cell
	//every time it finds an alive cell, it increases its value
	private int check (int x, int y) {
		int alive = 0;
		//we are going down and right
		//with xWidth and yHeight we are fixing the exception -> explained
		alive += life[(x + xWidth -1) % xWidth][(y-1 + yHeight) % yHeight];  //top left
		alive += life[(x + xWidth) % xWidth][(y-1 + yHeight) % yHeight];
		
		alive += life[(x + xWidth +1) % xWidth][(y-1 + yHeight) % yHeight];
		alive += life[(x + xWidth -1) % xWidth][(y + yHeight) % yHeight];
		
		alive += life[(x + xWidth +1) % xWidth][(y + yHeight) % yHeight];
		alive += life[(x + xWidth -1) % xWidth][(y+1 + yHeight) % yHeight];
		
		alive += life[(x + xWidth) % xWidth][(y+1 + yHeight) % yHeight];
		alive += life[(x + xWidth +1) % xWidth][(y+1 + yHeight) % yHeight];
		//we did that to count the cells around
		
		return alive;
	}
	
	
	
	//method for clearing the random input -> set back to 0
	private void clear() {
		for (int x = 0; x < life.length; x++) {
			for (int y = 0; y < (yHeight); y++) {
				//when it equals 0, it is turned off
				beforeLife[x][y] = 0;
			}
		}
	}
	
	
	
	
	//our class LifePanel must implement this method from ActionListener
	// implementing the rules of the game:
	public void actionPerformed(ActionEvent e) {
		int alive;

		for (int x = 0; x < life.length; x++) {
			// yPanel/size gives us the number of squares vertically
			for (int y = 0; y < (yHeight); y++) {
				//when we call the check() method, alive increases every time there is an alive neighbor
				alive = check(x, y);
				// if the cell has 3 or 2 neighbors, the cell is alive
				if (alive == 3) {
					beforeLife[x][y] = 1;
				} else if ((alive == 2) && (life[x][y] == 1)) {
					beforeLife[x][y] = 1;
				} else {
					beforeLife[x][y] = 0;
				}
			}
		}
		// the 'repaint' "refreshes" the page
		repaint();
	}
	
	
	// need to fix the closing of the streams
	private void saveProgress() {
		try {
			for (int x = 0; x < life.length; x++) { // for each row
				for (int y = 0; y < (yHeight); y++) { // for each column
					writer.write(life[x][y]); // append to the output
				}
				writer.write("\n");       //new line
			}
			writer.close();
			file.close();
			sc.close();
			reader.close();
		}catch (FileNotFoundException e) {}
		 catch (IOException e) {
		}
	}
	
	
	
	// need to fix the closing of the streams
    private void getProgress() {
	    try {
		    String line = reader.readLine();
		    while (line != null) {	
			    for (int x = 0; x < life.length; x++) { // for each row
				    for (int y = 0; y < (yHeight); y++) { // for each column
				    	line = reader.readLine();
				    	beforeLife[x][y] = reader.read(); // append to the output
				    	System.out.println(beforeLife[x][y]);
				    }
			    }
		    }
		    writer.close();
			file.close();
			sc.close();
			reader.close();
	    } catch (FileNotFoundException e) {}
	      catch (IOException e) { }
	    
	    repaint();
    }	
	
    
    
	public void inputTime(Scanner input) {
		System.out.print("Enter time in ms(miliseconds):  ");
		this.setTimeInput(input.nextInt());
		input.close();
	}
	
    
	
	
    void takePicture(LifePanel panel) {
    	  BufferedImage img = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
    	  // it draws the panel
    	  //so if we pass just the constructor, it will draw the background and the grid
    	  // but not the components, because it's a brand new panel
    	  // so when we pass a panel, we pass the current one (using 'this')
    	  panel.paint(img.getGraphics()); // or: panel.printAll(...);
    	  try {
    	    ImageIO.write(img, "png", new File("panel.png"));
    	  }
    	  catch (IOException e) {
    	    e.printStackTrace();
    	  }
    	}
    
    
	//writing the methods that will allow us to manually click on the panel
	//methods for the mouse:
	//detects the stuff the mouse does: dragging, holding, clicking etc.
	public void mouseDragged(MouseEvent e) {
		//here we make this so we can click on a cell and if it is on, we turn it off and vice versa
		int x = e.getX()/size;
		int y = e.getY()/size;
		
		//if the cell is dead, we set it to be alive in the new array
		if(life[x][y] == 0  &&  initial == 0) {
			beforeLife[x][y] = 1;
		}
		else if (life[x][y] == 1  &&  initial == 1) {
			beforeLife[x][y] = 0;
		}
		//to refresh it:
		repaint();
	}
	
	public void mousePressed(MouseEvent e) {	
		int x = e.getX()/size;
		int y = e.getY()/size;
		
		if(life[x][y] == 0) {
			initial = 0;
		}else{
			initial = -1;
		}
		repaint();
	}
	
	public void mouseReleased(MouseEvent e) {
		initial = -1;
	}
	
	public void mouseEntered(MouseEvent e) { }
	
	public void mouseExited(MouseEvent e) { }
	
	//movement of the mouse
	public void  mouseMoved(MouseEvent e) { }
	
	//MouseListener methods:
	public void mouseClicked(MouseEvent e) { }

	
	
	
	


	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		//if the given key is pressed
		//"R" for reset/random
		if(code == KeyEvent.VK_R) {
			//we will call the method for making the squares:
			spawn();
			time.start();
		}
		//"C" for clear
		else if(code == KeyEvent.VK_C) {
			clear();
			time.stop();
		}
		//"B" for begin -> start of the timer
		else if(code == KeyEvent.VK_B) {
			time.start();
		}
		//"A" for abandon -> timer will stop
		else if(code == KeyEvent.VK_A) {
			time.stop();
		}
		//"S" for save progress
		else if(code == KeyEvent.VK_S) {
			System.out.println(filename.length());
			if(filename.length() == 0) {
				saveProgress();
			}else {
			    filename.delete();
				saveProgress();
			}	
		}
		//"O" for continue
		else if (code == KeyEvent.VK_O) {
			getProgress();
			//time.start();

		}
		// "P" for Picture
		else if (code == KeyEvent.VK_P) {
			takePicture(this);

		}
		// "T" for save Time
		else if (code == KeyEvent.VK_T) {
			inputTime(input);
		}

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) { }

	@Override
	public void keyTyped(KeyEvent e) { }


}

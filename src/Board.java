import java.awt.*;
import java.awt.event.*;

public class Board extends Frame{
	public static final int width = 400;
	public static final int height = 300;
	public static final int unit = 16;
	public static final int row =15;
	public static final int col = 20;
	public static final int xoff = (width - (col*unit))/2;
	public static final int yoff = (height - (row*unit))/2;
	private Snake mSnake;
	
	//set the board
	public Board(String title){
		super(title);
		setSize(width,height);
		setVisible(true);
		setResizable(false);
		mSnake = new Snake();
	}
	
	//draw the board and the snake
	public void drawRec(Graphics g){
		//draw the board
		g.setColor(Color.RED);
		g.drawRect(xoff,yoff,col * unit, row * unit);
	}
	
	
	//draw the snake
	public void drawSnake(Graphics g){
		g.setColor(Color.BLACK);
		for(int i = 0; i < mSnake.getLength(); i++){
			Body temp = mSnake.getBody(i);
			g.fillRect(temp.col*unit + xoff,temp.row*unit+yoff,unit,unit);
		}
	}
	
	public void paint(Graphics g){
		drawSnake(g);
		drawRec(g);
	}
	
	public static void main(String[] args){
		Board game = new Board("Snake");
	}
}

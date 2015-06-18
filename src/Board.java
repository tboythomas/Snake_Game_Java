import java.awt.*;
import java.awt.event.*;

public class Board extends Frame{
	public static final int width = 400;
	public static final int height = 300;
	public static final int unit = 16;
	public static final int row =15;
	public static final int col = 20;
	public static final int xoff = width - (col*unit)/2;
	public static final int yoff = height - (row*unit)/2;
	
	//set the board
	public Board(String title){
		super(title);
		setSize(300,400);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args){
		Board game = new Board("Snake");
	}
}

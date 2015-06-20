import java.util.*;

enum Direction{
	up,down,left,right;
}

public class Snake {
	private List <Body> mBody;
	private Direction mDirection;
	private Body head;
	private Body headold;
	
	public Snake(){
		mBody = new ArrayList<Body>();
		Reset();
		head = null;
		headold = mBody.get(0);
	}
	
	//method for moving
	public void Move(Board game){
		switch(mDirection){
		case up:
			head = new Body(headold.row -1, headold.col);
			break;
		case down:
			head = new Body(headold.row + 1, headold.col);
			break;
		case left:
			head = new Body(headold.row, headold.col -1);
			break;
		case right:
			head = new Body(headold.row, headold.col + 1);
			break;
		}
		mBody.add(0,head);
		mBody.remove(mBody.size() - 1);
	}
	
	//set the next direction
	public void nextDriection(Direction d){
		mDirection = d;
	}
	
	//return body with index
	public Body getBody(int index){
		return mBody.get(index);
	}
	
	//return the length of the snake
	public int getLength(){
		return mBody.size();
	}
	
	//reset the body of the snake.
	public void Reset(){
		mBody.clear();
		mBody.add(new Body(7,4));
		mBody.add(new Body(7,3));
		mBody.add(new Body(7,2));
		mBody.add(new Body(7,1));
		mDirection = Direction.right;
	}
}

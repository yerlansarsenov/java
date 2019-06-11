package problem5;

import java.awt.Point;

public class Knight extends Piece{
	public Knight(Point p){
		super(p);
	}
	@Override
	public boolean canMove(Point a, Point b){
		boolean b1 = (a.getX()==b.getX()+1)&&(a.getY()==b.getY()+2);
		boolean b2 = (a.getX()==b.getX()-1)&&(a.getY()==b.getY()+2);
		boolean b3 = (a.getX()==b.getX()+1)&&(a.getY()==b.getY()-2);
		boolean b4 = (a.getX()==b.getX()-1)&&(a.getY()==b.getY()-2);
		boolean b5 = (a.getX()==b.getX()+2)&&(a.getY()==b.getY()+1);
		boolean b6 = (a.getX()==b.getX()-2)&&(a.getY()==b.getY()+1);
		boolean b7 = (a.getX()==b.getX()+2)&&(a.getY()==b.getY()-1);
		boolean b8 = (a.getX()==b.getX()-2)&&(a.getY()==b.getY()-1);
		return (b1||b2||b3||b4||b5||b6||b7||b8) && super.canMove(a, b);
	}
}

package problem5;

import java.awt.Point;

public class Queen extends Piece{
	public Queen(Point p){
		super(p);
	}
	@Override
	public boolean canMove(Point a, Point b){
		boolean b1 = (a.getX()==b.getX() && a.getY()!=b.getY()) || (a.getX()!=b.getX() && a.getY()==b.getY());
		boolean b2 = (Math.abs(a.getX()-b.getX())==Math.abs(a.getY()-b.getY()));
		return (b1||b2) && super.canMove(a, b);
	}
}

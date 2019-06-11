package problem5;

import java.awt.Point;

public class Bishop extends Piece{
	public Bishop(Point p){
		super(p);
	}
	@Override
	public boolean canMove(Point a, Point b){
		return (Math.abs(a.getX()-b.getX())==Math.abs(a.getY()-b.getY())) && super.canMove(a, b);
	}
}
package problem5;

import java.awt.Point;

public class Rook extends Piece{
	public Rook(Point p){
		super(p);
	}
	@Override
	public boolean canMove(Point a, Point b){
		return (a.getX()==b.getX() && a.getY()!=b.getY()) || (a.getX()!=b.getX() && a.getY()==b.getY()) && super.canMove(a, b);
	}
}

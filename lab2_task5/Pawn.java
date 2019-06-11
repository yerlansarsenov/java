package problem5;

import java.awt.Point;

public class Pawn extends Piece{
	public Pawn(Point p){
		super(p);
	}
	@Override
	public boolean canMove(Point a, Point b){
		return a.getX()==b.getX() && a.getY()==b.getY()+1 && super.canMove(a, b);
	}
}

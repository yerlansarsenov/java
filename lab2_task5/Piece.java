package problem5;

import java.awt.Point;

public class Piece {
	public static Piece[] pieces;
	public Point p;
	public Piece(Point p){
		this.p = p;
	}
	public static boolean areTherePiece(Point q){
		for(int i = 0;i < pieces.length; i++){
			if(pieces[i].p==q){
				return true;
			}
		}
		return false;
	}
	public boolean canMove(Point a, Point b){
		return !areTherePiece(b);
	}
}

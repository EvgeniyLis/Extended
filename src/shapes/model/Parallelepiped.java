package shapes.model;

public class Parallelepiped extends Rectangle {
	private int c;

	public Parallelepiped(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Parallelepiped [c=" + c + "] and square is "+getSquare()+" and volume is "+getVolume();
	}
	public int getSquare() {
		return c*super.getPerim()+2*super.getSquare();
	}
	public int getVolume() {
		return c*super.getSquare();
	}
}


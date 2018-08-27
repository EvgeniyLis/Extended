package shapes.model;

public class Elips {
	private int a;
	private int b;
	public Elips(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Elips [a=" + a + ", b=" + b + "]";
	}
	public double getLength() {
		return (a+b)/2*Math.PI;
	}
	public double getSquare() {
		return Math.PI*a*b;
	}
}

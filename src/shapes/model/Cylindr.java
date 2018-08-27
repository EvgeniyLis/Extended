package shapes.model;

public class Cylindr extends Elips {
	private int h;

	public Cylindr(int a, int b, int h) {
		super(a, b); // ��� ����� ������������ ������, ���� �������� ����� super ���. �� �������� - ��� ����� ������������ ������, � ���� ���. �����, �� ��� ��������� � ��������� ������
		this.h = h;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "Cylindr [h=" + h + "]";
	}
	public double getSquare() {
		return 2*super.getSquare()+h*super.getLength();
	}
	public double getVolume() {
		return h*super.getSquare();
	}
}

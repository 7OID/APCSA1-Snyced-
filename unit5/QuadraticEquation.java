package unit5;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String toString() {
		return a + "x^2 + " + b + "x + " + c;
	}
	public double getAxisOfSymmetry() {
		return -b / (2 * a);
	}
	public double[] getVertex() {
		double x = -b / (2 * a);
		double y = a * x * x + b * x + c;
		double[] arr = new double[2];
		arr[0] = x;
		arr[1] = y;
		return arr;
	}
	public boolean hasRealRoots() {
		double num = b * b - 4 * a * c;
		if(num < 0) {
			return false;
		}else {
			return true;
		}
	}
	public int getNumRoots() {
		double num = b * b - 4 * a * c;
		if(num < 0) {
			return 0;
		}else if(num == 0) {
			return 1;
		}else {
			return 2;
		}
	}
	public double[] getRealRoots() {
		double num = b * b - 4 * a * c;
		if(num > 0) {
			num = Math.sqrt(num);
		}else {
			return null;
		}
		
		double root1 = (-b + num) / (2 * a);
		double root2 = (-b - num) / (2 * a);
		double[] arr = new double[2];
		arr[0] = root1;
		arr[1] = root2;
		return arr;
	}
	public boolean hasMinimum() {
		return a < 0;
	}
	public boolean hasMaximum() {
		return a > 0;
	}
	public double getYIntercept() {
		return c;
	}
}

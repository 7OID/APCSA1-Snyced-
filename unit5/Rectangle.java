package unit5;

public class Rectangle {
	/**
	 * Program: Rectangle
Design a class called Rectangle which contains information about a geometric rectangle
which is parallel to the x-axis. The class must contain the following instance variables:
x1 – double – top left x value
y1 – double – top left y value
x2 – double – bottom right x value
y2 – double – bottom right y value
Create one constructor which receives all four
parameters. The class must contain appropriate
getters, setters, and toString method. Additionally,
the class must contain the following utility methods:
getArea() – double
getPerimeter() – double
getCrossDiagonalLength() – double
getTopLeftPoint() – double[]
getBottomRightPoint() – double[]
Test the class in a runner which instantiates two or more Rectangle objects, and calls each
of the methods.
	 */
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	public Rectangle(double x1,double y1,double x2,double y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getY1() {
		return y1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getY2() {
		return y2;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
	public double getArea() {
		return (x2-x1)*(y1-y2);
	}
	public double getPerimeter() {
		return (x2-x1)*2+(y1-y2)*2;
	}
	public double getCrossDiagonalLength() {
		double side1= x2-x1;
		double side2= y1-y2;
		double ans = Math.sqrt(side1*side1+side2*side2);
		return Math.round(ans * 100.0) / 100.0;
	}
	public double[] getTopLeft() {
		double[] topLeft = {x1,y1};
		return topLeft;
	}
	public double[] getTopRight() {
		double[] topRight = {x2,y2};
		return topRight;
	}

}
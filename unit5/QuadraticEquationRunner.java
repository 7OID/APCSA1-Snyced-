package unit5;
public class QuadraticEquationRunner {
	public static void main(String[] args) {
		QuadraticEquation q = new QuadraticEquation(1, 3, 0);
		System.out.println(q);
		System.out.println("axis of symmetry: " + q.getAxisOfSymmetry());
		System.out.println("vertex: " + q.getVertex()[0] + ", " + q.getVertex()[1]);
		System.out.println("has real roots: " + q.hasRealRoots());
		System.out.println("num roots: " + q.getNumRoots());
		System.out.println("real roots: " + q.getRealRoots()[0] + ", " + q.getRealRoots()[1]);
		System.out.println("has min: " + q.hasMinimum());
		System.out.println("has max: " + q.hasMaximum());
	}
	
}
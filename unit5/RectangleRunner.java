package unit5;

public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle a = new Rectangle(2,4,4,0);
        Rectangle b = new Rectangle(0,3,2,-3);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println(a.getCrossDiagonalLength());
        System.out.println(a.getTopLeft()[0]+","+a.getTopLeft()[1]);
        System.out.println();
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(b.getCrossDiagonalLength());
        System.out.println(b.getTopLeft()[0]+","+b.getTopLeft()[1]);

    }

}

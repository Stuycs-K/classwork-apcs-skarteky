public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p1);
    Point p5 = new Point(6.5, -3.4);
    Point p6 = new Point(p5);
    Point p7 = new Point(0,0);
    Point p8 = new Point(p7);
    Point p9 = new Point(-4.5, 10);
    Point p10 = new Point(p9);
    System.out.println( p3);
    System.out.println(p4);
    System.out.println(p6);
    System.out.println(p8);
    System.out.println(p9);
    System.out.println( distance(p1,p2));
    System.out.println( distance(p2,p9));
    System.out.println( distance(p7,p5));
    System.out.println( distance(new Point(10,10), p10));
    System.out.println( distance(p3,p6));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
  }
}

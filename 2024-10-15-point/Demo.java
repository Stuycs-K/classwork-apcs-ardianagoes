public class Demo {

 /*
 Write this method third. Test it then move on
 to the others.
 */
 public static double distance(Point a, Point b) {
   return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
 }

 public static void main(String[]args) {
   Point p1 = new Point(1,1);
   Point p2 = new Point(-1,-1);
   Point p3 = new Point(3,4);
   Point p4 = new Point(p3);
   Point p5 = new Point(100, 1);
   Point p6 = new Point(p5);
   Point p7 = new Point(100, 100);
   Point p8 = new Point(p7);

   System.out.println("\n-----Testing Point(Point other) constructor-----");
   System.out.println("\nOriginal Point: " + p3);
   System.out.println("Cloned Point: " + p4);
   System.out.println("\nOriginal Point: " + p5);
   System.out.println("Cloned Point: " + p6);
   System.out.println("\nOriginal Point: " + p7);
   System.out.println("Cloned Point: " + p8);
   System.out.println("\n-----Testing Point(Point other) constructor-----");


   System.out.println(distance(p1,p2));
   System.out.println(Point.distance(p1,p2));
   System.out.println(p1.distanceTo(p2));
   System.out.println(distance(p2,p1));
   System.out.println(Point.distance(p2,p1));
   System.out.println(p2.distanceTo(p1));
   System.out.println(distance(p3,p4));
   System.out.println(Point.distance(p3,p4));
   System.out.println(p3.distanceTo(p4));

   Point triPoint1 = new Point(0, 0);
   Point triPoint2 = new Point(2, 0);

   // 1^2 + x^2 = 2^2
   // 1 + x^2 = 4
   // x^2 = 3

   Point triPoint3 = new Point(1, Math.sqrt(3));

   System.out.println("Side Length Between Point 1 and 2: " + distance(triPoint1, triPoint2));
   System.out.println("Side Length Between Point 1 and 3: " + triPoint1.distanceTo(triPoint3));
   System.out.println("Side Length Between Point 2 and 3: " + Point.distance(triPoint2, triPoint3));


 }
}

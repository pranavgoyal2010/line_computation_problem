public class Main {
    public static void main(String[] args){

        /**
         * This is UC 2 where we need to check the equality of two lines.
         * */

        Point point1 = new Point(2,3);
        Point point2 = new Point(7,9);

        Point point3 = new Point(2,3);
        Point point4 = new Point(8,9);

        double length1 = Math.sqrt(Math.pow(point2.getX()-point1.getX(), 2) + Math.pow(point2.getY()-point1.getY(), 2));
        double length2 = Math.sqrt(Math.pow(point4.getX()-point3.getX(), 2) + Math.pow(point4.getY()-point3.getY(), 2));

        if(length1==length2)
            System.out.println("Lines are equal");
        else if(length1>length2)
            System.out.println("Line 1 is greater than Line 2");
        else
            System.out.println("Line 1 is lesser than Line 2");
    }
}

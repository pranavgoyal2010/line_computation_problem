public class Main {
    public static void main(String[] args){

        /**
         * This is UC 2 where we need to check the equality of two lines.
         * */

        Point point1 = new Point(2,3);
        Point point2 = new Point(7,9);

        Point point3 = new Point(2,3);
        Point point4 = new Point(7,9);


        if(point1.getX()==point3.getX() && point1.getY()==point3.getY()
        && point2.getX()==point4.getX() && point2.getY()==point4.getY())
            System.out.println("Lines are equal");

        else
            System.out.println("Lines are not equal");
    }
}

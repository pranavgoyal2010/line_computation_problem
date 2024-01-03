public class Main {
    public static void main(String[] args){

        /**
         * This is UC 4 where we need to OOP to check equality of two lines and also compare the
         * length of the two lines
         * */

        Point point1 = new Point(2,3);
        Point point2 = new Point(9,9);

        Point point3 = new Point(2,3);
        Point point4 = new Point(8,9);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);


        if(line1.equals(line2))
        {
            System.out.println("Lines are equal");
        }
        else{
            System.out.println("Lines are not equal");
        }


        if(line1.compareTo(line2)==0)
        {
            System.out.println("Lines are equal in length");
        }
        else if(line1.compareTo(line2)<0)
        {
            System.out.println("Line1 is smaller than Line2 in length");
        }
        else
        {
            System.out.println("Line1 is greater than Line2 in length");
        }
    }
}

public class Main {
    public static void main(String[] args){

        /**
         * This is UC 1 where we need to compute the length of the line given its coordinates.
         * */

        int x1, x2, y1, y2;
        x1=2;
        y1=3;
        x2=7;
        y2=9;

        double length = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("The length of line is: " + length);
    }
}

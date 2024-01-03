public class Line implements Comparable<Line>{
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2)
    {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public double length(Line line)
    {
        int xDiff = Math.abs(line.getPoint2().getX()-line.getPoint1().getX());
        int yDiff = Math.abs(line.getPoint2().getY()-line.getPoint1().getY());

        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public boolean equals(Line line)
    {
        boolean point1X = this.point1.getX()==line.point1.getX();
        boolean point1Y = this.point1.getY()==line.point1.getY();

        boolean point2X = this.point2.getX()==line.point2.getX();
        boolean point2Y = this.point2.getY()==line.point2.getY();

        return point1X && point1Y && point2X && point2Y;
    }


    @Override
    public int compareTo(Line line) {
        return Double.compare(length(this), length(line));
    }
}

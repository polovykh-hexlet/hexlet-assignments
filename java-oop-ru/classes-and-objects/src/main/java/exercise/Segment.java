package exercise;

// BEGIN
class Segment {
    private Point beginPoint;
    private Point endPoint;

    Segment(Point bp, Point ep) {
        beginPoint = bp;
        endPoint = ep;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        Point mid = new Point(
            (beginPoint.getX() + endPoint.getX()) / 2,
            (beginPoint.getY() + endPoint.getY()) / 2
            );
        return mid;
    }

}
// END

class Point {
    double a,b;

    public Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double distance(Point o) {
        double x = this.a - o.a;
        double y = this.b - o.b;
        return Math.sqrt(x * x + y * y);
    }
}
class Triangle {
   Point[] v = new Point[3];

   public Triangle(Point p1, Point p2, Point p3) {
       v[0] = p1;
       v[1] = p2;
       v[2] = p3;
   }

   public double calculatePerimeter() {
       double s1 = v[0].distance(v[1]);
       double s2 = v[1].distance(v[2]);
       double s3 = v[2].distance(v[0]);
       return s1+s2+s3;
   }

   public double calculateArea() {

   }




}
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
       double s1 = v[0].distance(v[1]);
       double s2 = v[1].distance(v[2]);
       double s3 = v[2].distance(v[0]);
       double s = (s1 + s2 +s3) / 2;
       return  Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
   }

   public boolean isPointInside(Point point) {
       double totalArea = calculateArea();
       double a1 = new Triangle(point, v[1], v[2]).calculateArea();
       double a2 = new Triangle(v[0], point, v[2]).calculateArea();
       double a3 = new Triangle(v[0], v[1], point).calculateArea();

       return totalArea == (a1 + a2 + a3);
   }

   public String classifyTriangle() {
       double s1 = v[0].distance(v[1]);
       double s2 = v[1].distance(v[2]);
       double s3 = v[2].distance(v[0]);

       if (s1 == s2 && s2 == s3) {
           return "Equilateral";
       } else if (s1 == s2 || s2 == s3 || s3 == s1) {
           return "Isosceles";
       } else {
           return "Unknown";
       }
   }




}
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of triangles: ");
        int numOfTriangles = input.nextInt();

        Triangle[] triangles = new Triangle[numOfTriangles];

        for (int i = 0; i < numOfTriangles; i++) {
            System.out.println("Enter the coordinates of the triangle  " + (i + 1));
            Point[] v = new Point[3];

            for (int j = 0; j < 3; j++) {
                System.out.println("Vertix " + (j + 1) + " X and Y: ");
                double x = input.nextDouble();
                double y = input.nextDouble();
                v[j] = new Point(x, y);
            }

            triangles[i] = new Triangle(v[0], v[1], v[2]);
        }

        for (int i = 0; i < numOfTriangles; i++) {
            Triangle triangle = triangles[i];
            double perimeter = triangle.calculatePerimeter();
            double area = triangle.calculateArea();
            String classification = triangle.classifyTriangle();

            System.out.println("Triangle "+ (i + 1) + " , Perimeter: "+ perimeter + " , Area: "+area+" ,Type: " + classification);
            double x = input.nextDouble();
            double y = input.nextDouble();
            Point point = new Point(x, y);

            if (triangle.isPointInside(point)) {
                System.out.println("The point is inside the triangle.");
            } else {
                System.out.println("The point is outside the triangle");
            }
        }

    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of triangles: ");
        int numOfTriangles = input.nextInt();

        Triangle[] triangles = new Triangle[numOfTriangles];

        for (int i = 0; i < numOfTriangles; i++) {
            System.out.println("Enter the coordinates of the triangle 1" + (i + 1));
            Point[] vertices = new Point[3];

            for (int j = 0; j < 3; j++) {
                System.out.println("Vertix " + (j + 1) + " X and Y: ");
                double x = input.nextDouble();
                double y = input.nextDouble();
                vertices[j] = new Point(x, y);
            }

            triangles[i] = new Triangle(vertices[0], vertices[1], vertices[2]);
        }

    }
}

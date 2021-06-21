public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0, 0), 1, Shapes.Color.BLACK);

        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 1), Shapes.Color.RED);

        Square square = new Square(new Point(5, 5), 2, Shapes.Color.BLUE);

        Shapes shapes = triangle;
        Object object = triangle;
        triangle = (Triangle) object;

        Shapes[] shapes1 = {circle, triangle, square};
        printArrayElements(shapes1);

        Shapes maxShapes = findShapeWithMaxArea(shapes1);
        System.out.println("Shape with max area:" + maxShapes);
    }
    private static void printArrayElements(Object[] objects){
        for (int i=0;i<objects.length;i++){
            System.out.println((i+":"+objects[i]));
        }


    }
    private static Shapes findShapeWithMaxArea(Shapes[] shapes){
        Shapes maxShapes=null;
        double maxArea=Double.NEGATIVE_INFINITY;
        for (Shapes shape:shapes){
            double area=shape.getArea();
            if (area>maxArea) {
                maxArea = area;
                maxShapes = shape;
            }
        }
        return maxShapes;

    }
}

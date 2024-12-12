public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(4, 4, 5);

        ShapeVisitor areaCalculator = new AreaCalculator();
        ShapeVisitor perimeterCalculator = new PerimeterCalculator();

        System.out.println("Calculating areas:");
        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);
        triangle.accept(areaCalculator);

        System.out.println("\nCalculating perimeters:");
        circle.accept(perimeterCalculator);
        rectangle.accept(perimeterCalculator);
        triangle.accept(perimeterCalculator);
    }

}
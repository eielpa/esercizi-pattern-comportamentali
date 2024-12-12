public class PerimeterCalculator implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {

        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Circle perimeter: " + perimeter);

    }

    @Override
    public void visit(Rectangle rectangle) {

        double perimeter = 2*(rectangle.getWidth()+rectangle.getHeight());
        System.out.println("Rectangle perimeter: " + perimeter);

    }

    @Override
    public void visit(Triangle triangle) {

        double perimeter= triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
        System.out.println("Triangle perimeter: " + perimeter);

    }
}

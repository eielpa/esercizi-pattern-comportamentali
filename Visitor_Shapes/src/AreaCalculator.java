public class AreaCalculator implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {

        double area= Math.PI* Math.pow(circle.getRadius(), 2);
        System.out.println("Circle area: " + area);

    }

    @Override
    public void visit(Rectangle rectangle) {

        double area= rectangle.getWidth()*rectangle.getHeight();
        System.out.println("Rectangle area: " + area);

    }

    @Override
    public void visit(Triangle triangle) {

        double s=(triangle.getSideA())+(triangle.getSideB())+(triangle.getSideC());
        double area= Math.sqrt(s * (s-triangle.getSideA()) * (s-triangle.getSideB()) * (s-triangle.getSideC()));
        System.out.println("Triangle area: " + area);

    }
}

public class Circle extends Shape{
    double radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "I am " +super.color+ "Circle with area " + area();
    }
}

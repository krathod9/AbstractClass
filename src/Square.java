public class Square extends Shape{
    int side;
    public Square(String color,int side) {
        super(color);
        this.side=side;
    }

    @Override
    double area() {
        return Math.pow(side,2);
    }

    @Override
    String info() {
        return "I am a " +super.color+" square with area "+area();
    }
}

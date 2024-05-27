package homework_06.work1.refactor;

public class Square extends QuadRangle{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

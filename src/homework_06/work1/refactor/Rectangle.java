package homework_06.work1.refactor;

public class Rectangle extends QuadRangle{

    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        return width * height;
    }
}

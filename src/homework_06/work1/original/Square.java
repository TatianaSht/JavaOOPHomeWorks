package homework_06.work1.original;

// Квадрат
public class Square extends Rectangle{
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
}

package tr.workintech.courses.s14d1;

public abstract class Fruit {

    // renk, boyut (yukseklik, genislik)

    private String color;
    private double height;
    private double width;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double getSugarRate();
}

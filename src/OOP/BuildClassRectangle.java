package OOP;

public class BuildClassRectangle {
    private int width;
    private int height;

    public BuildClassRectangle() {
    }

    private BuildClassRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int getArea() {
        return this.width * this.height;
    }

    private int getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public static void main(String[] args) {
        BuildClassRectangle buildClassRectangle = new BuildClassRectangle(4, 40);
        int area = buildClassRectangle.getArea();
        int perimeter = buildClassRectangle.getPerimeter();
        System.out.println("height: " + buildClassRectangle.height);
        System.out.println("width: " + buildClassRectangle.width);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the retangle: " + perimeter);
    }
}

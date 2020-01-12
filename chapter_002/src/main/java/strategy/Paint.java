package strategy;

public class Paint {
    public static void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        draw(square);
        draw(triangle);
    }
}


public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(5);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
    }
}

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Circle(15);
        shapes[2] = new Triangle(20, 50);
        IOManager.printArea(Calculator.calculateTotalArea(shapes));
    }

}

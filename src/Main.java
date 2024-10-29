//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Rectangle rectangle1 = new Rectangle(5.0, 7.0);
        Square square1 = new Square(5.0);

        System.out.println("Circle Area: " + circle1.attributes());
        System.out.println("Rectangle Area: " + rectangle1.attributes());
        System.out.println("Square Area: " + square1.attributes());
        }
    }

package packageUno;

public class TestCircle {
    public static void main(String[] args) {
        // Circle.radius = 2;
        // above code if typed would say that radius has private access
        Circle circle1 = new Circle();
        // circle1 is an object created with the default constructor
        // hence circle1 has a radius = 1 and color = Blue

        // circle1.radius = 2;
        // above code if typed would say that radius has private access
        // Same as trying to alter the class's variable, trying to alter the variable
        // through the object would also not be possible

        // using the getters to print out the following
        System.out.println("The circle has a radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(8);
        // a new circle with radius = 8, wonder what color it is?

        System.out.println("The circle has a radius of " + circle2.getRadius() + " and area of " + circle2.getArea());
    }
}

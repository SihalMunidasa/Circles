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
        System.out.println(circle1);

        Circle circle2 = new Circle(8);
        // a new circle with radius = 8, wonder what color it is?

        System.out.println(circle2);

        // Instantiating a new third circle object that is not the default values
        Circle circle3 = new Circle(10, "Red");

        System.out.println(circle3.toString());
        System.out.println(circle3);
        // both methods do the same job

        // Changing values
        circle1.setColor("Green"); circle1.setRadius(5);
        circle2.setRadius(15);

        System.out.println(circle1);
        System.out.println(circle2);
    }
}

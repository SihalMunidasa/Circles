package packageUno;

public class Circle {
    // instance variables made private
    // therefore, not accessible outside this class (Encapsulation)
    // means that for a circle object 'x'; x.radius and x.color will not work
    private double radius;
    private String color;

    // a default constructor for a circle
    // so that a circle can be created the following values
    // without passing the following values
    // Circle x = new Circle(); would create a circle 'x'
    // where x has radius = 1 and color = "Blue"
    public Circle () {
        radius = 1;
        color = "Blue";
    }

    // a second constructor where the user create a circle with radius of his/her choice
    // but default color remains blue [wonder what the creator's favorite color is :)]
    public Circle (double radius) {
        this.radius = radius;
        color = "Blue";
    }

    // allowing the user to access the attribute 'radius' using a getter
    // without straight up altering it using circle.radius
    public double getRadius() {
        return radius;
    }

    // a behaviour for a circle to calculate the area of a circle object when called
    public double getArea () {
        return Math.PI*radius*radius;
    }
}

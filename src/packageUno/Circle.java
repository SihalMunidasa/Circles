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

    // a second constructor where the user creates a circle with radius of his/her choice
    // but default color remains blue [wonder what the creator's favorite color is :)]
    public Circle (double radius) {
        this.radius = radius;
        color = "Blue";
    }

    // a third constructor where the uer can create his/her own circle
    // altering the default attribute values
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // allowing the user to access the attribute 'radius' using a getter
    // without straight-up altering it using circle.radius
    public double getRadius() {
        return radius;
    }

    // a behaviour for a circle to calculate the area of a circle object when called
    public double getArea () {
        return Math.PI*radius*radius;
    }

    // a behaviour for the circle to return its color when prompted
    public String getColor() {
        return color;
    }

    // behaviours to allow user to change the values using setters
    public void setRadius(double radius) {
        this.radius = radius;
        // this keyword is used as a reference to the current object
        // hence it resolves naming conflicts
    }

    public void setColor(String color) {
        this.color = color;
    }
}

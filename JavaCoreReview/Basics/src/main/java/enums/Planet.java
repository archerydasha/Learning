package enums;

/**
 * Created by Dasha on 9/16/2016.
 */
public enum Planet {
    MERCURY ("Mercury", 3.303e+23, 2.4397e6),
    VENUS   ("Venus", 4.869e+24, 6.0518e6),
    EARTH   ("Earth", 5.976e+24, 6.37814e6),
    MARS    ("Mars", 6.421e+23, 3.3972e6),
    JUPITER ("Jupiter", 1.9e+27,   7.1492e7),
    SATURN  ("Saturn", 5.688e+26, 6.0268e7),
    URANUS  ("URANUS", 8.686e+25, 2.5559e7),
    NEPTUNE ("Neptune", 1.024e+26, 2.4746e7);
    private String name;
    private double mass;
    private double radius;

    Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public static final double G = 6.67300E-11;

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }

}

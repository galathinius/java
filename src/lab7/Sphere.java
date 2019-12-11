package lab7;

public class Sphere implements GeometricBody {
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * (radius^2) * 3.1415926;
    }

    @Override
    public double getVolume() {
        return (radius^3)*(4/3) * 3.1415926;
    }
}

package lab7;

public class Cube implements GeometricBody {
    int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double getSurface() {
        return 6*length^2;
    }

    @Override
    public double getVolume() {
        return length^3;
    }
}

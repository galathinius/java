package lab7;

public class Parallelepiped implements GeometricBody {
    int length;
    int width;
    int height;

    public Parallelepiped(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 2*(length*height + width*height + length*width);
    }

    @Override
    public double getVolume() {
        return length*width*height;
    }
}

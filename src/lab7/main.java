package lab7;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<GeometricBody> bodies = new ArrayList<>();
//        GeometricBody[] bodies = new GeometricBody[0];

        bodies.add(new Cube(2));
        bodies.add(new Sphere(2));
        bodies.add(new Parallelepiped(2, 2, 3));

        System.out.println(GeometricBodyController.maxSurface(bodies));


    }
}

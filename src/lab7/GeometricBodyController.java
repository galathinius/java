package lab7;

import java.util.ArrayList;

public class GeometricBodyController {

    static GeometricBody maxVolume(ArrayList<GeometricBody> bodies){
        double maximumVolume = 0;
        int i, maxIndex = 0;

        for(i = 0; i < bodies.size(); i++ ) {

             if(bodies.get(i).getVolume() > maximumVolume){
                maximumVolume = bodies.get(i).getVolume();
                maxIndex = i;
            }
        }
        return bodies.get(maxIndex);
    }

    static GeometricBody maxSurface(ArrayList<GeometricBody> bodies){
        double maximumSurface = 0;
        int i, maxIndex = 0;

        for(i = 0; i < bodies.size(); i++ ) {

            if(bodies.get(i).getSurface() > maximumSurface){
                maximumSurface = bodies.get(i).getSurface();
                maxIndex = i;
            }
        }
        return bodies.get(maxIndex);
    }
}

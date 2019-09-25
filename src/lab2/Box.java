package lab2;

public class Box {
    //height, width and depth
    int height;
    int width;
    int depth;

    Box(){
        height = 1;
        width = 1;
        depth = 1;
    }

    Box(int height){
        this.height = height;
        this.width = height;
        this.depth = height;
    }

    Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    int Volume(){
        return height * depth * width;
    }

    int Surface(){
        return 2 * ( height * depth + depth * width + width * height );
    }
}

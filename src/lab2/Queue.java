package lab2;

import java.util.ArrayList;

public class Queue {
    private ArrayList<String> strings;
    int size = -1;
    private int elementsNumber = 0;

    Queue(){
        strings = new ArrayList<String>();
    }

    Queue(int Size){
        strings = new ArrayList<String>(Size);
        this.size = Size;
    }

    void push(String value){
        strings.add(value);
        elementsNumber++;
    }

    String pop(){
        String toReturn = strings.get(0);
        strings.remove(0);
        elementsNumber--;
        return toReturn;
    }

    boolean isFull(){
        return (size != -1 && size == elementsNumber);

    }

}

package ro.uvt.p3.io;

import ro.uvt.p3.Fruit;
import ro.uvt.p3.apple;
import ro.uvt.p3.banana;

import java.util.Arrays;

public class InputDevice {

    public String nextLine(){
        return "The quick brown fox jumps over the lazy dog.";
    }

    public Fruit[] readFruit() {
        Fruit[] arr = new Fruit[3];
        arr[0] = new banana(50,10,5);
        arr[1] = new apple(60,30,15,"Green");
        arr[2] = new banana(150,80,10);
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
}

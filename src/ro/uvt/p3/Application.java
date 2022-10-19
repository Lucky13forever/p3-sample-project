package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

public class Application {
    private InputDevice id;
    private OutputDevice od;

    public Application(InputDevice id, OutputDevice od) {
        this.id = id;
        this.od = od;
    }
    public void computeWeight(Fruit[] fruits){
        int sum=0;
        for(int i=0;i<fruits.length;i++)
            sum+=fruits[i].weight;
        System.out.println(sum);
    }

    public void computeSugar(Fruit[] fruits){
        int sum=0;
        for(int i=0; i<fruits.length;i++){
            sum+=fruits[i].sugar_content;
        }
        System.out.println(sum);
    }

    public void run(){
        Fruit[] fruits = id.readFruit();
        computeWeight(fruits);
        computeSugar(fruits);
    }
}

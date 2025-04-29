package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-22日--22:12
 */

class WaterSource{


    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {

        return s;

    }
}

public class SprinklerSystem {

    private String value1,value2,value3,value4;
    private WaterSource source = new WaterSource();
    private int i;
    private  float f;


    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}

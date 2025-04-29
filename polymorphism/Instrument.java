package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--10:44
 */
public class Instrument {

    public void play(Note n) {
        System.out.println("Instrument.play() "+n);
    }

    //添加的新方法
    String what(){
        return "Instrument";
    }

    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

package polymorphism;

/**
 * @description  管乐器
 * @author: RicksonYu
 * @create: 2024年-12月-17日--10:44
 */
public class Wind extends Instrument{


    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    @Override
    String what() {
       return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

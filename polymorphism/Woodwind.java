package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--13:13
 */
public class Woodwind extends Wind{

    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play() " +n);
    }

    @Override
    String what() {
        return "Woodwind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

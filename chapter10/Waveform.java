package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-30日--21:27
 */



public class Waveform {

    private static long counter;
    private final long id = counter++;
    @Override public String toString(){
        return "Waveform " + id;
    }
}

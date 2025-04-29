package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-30日--21:52
 */
public class Filter {

    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input)
    {
        return input;
    }
}

package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-30日--21:57
 */
public class HighPass extends Filter{

    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    @Override
    public Waveform process(Waveform input)
    {
        return input;
    }
}

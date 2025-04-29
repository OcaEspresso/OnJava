package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-30日--21:55
 */
public class LowPass extends Filter{

    double cutoff;
    public LowPass(double cutoff)
    {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // 哑处理(dummy processing)
    }
}

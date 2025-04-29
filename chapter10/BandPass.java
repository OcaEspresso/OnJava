package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-30日--22:02
 */
public class BandPass extends Filter{

    double lowCutoff , highCutoff;
    public BandPass(double lowCut,double highCut){

        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

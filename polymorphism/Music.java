package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--10:51
 */
public class Music {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        //方法tune接受一个Instrument的引用，flute继承了Instrument,所以也能运行这个方法,不需要强制类型转换
        Wind flute = new Wind();
        tune(flute);
    }
}

package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--13:07
 */
public class Music3 {

    //并不关心类，添加到系统的新类型仍然正常工作
    public static void tune(Instrument i){

        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e){

        for(Instrument i : e)
            tune(i);


    }


    public static void main(String[] args) {
        //数组填充时会向上转型
        Instrument[] orchesra = {

                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchesra);
    }



}

//package chapter10;
//
//import polymorphism.Note;
///**
// * @description
// * @author: RicksonYu
// * @create: 2025年-01月-27日--15:13
// */
//
//abstract class Instrument{
//    private int i;//该变量在每个对象里都会被分配内存
//    public abstract void play(Note n);
//    public String what(){return "Instrument";}
//    public abstract void adjust();
//}
//
//class Wind extends Instrument{
//    @Override
//    public void play(Note n) {
//        System.out.println("Wind.play()" + n);
//    }
//
//    @Override
//    public String what() {
//        return "Wind";
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("adjusting wind");
//    }
//}
//
//class Percussion extends Instrument{
//    @Override
//    public void play(Note n) {
//        System.out.println("Percussion.play()" + n);
//    }
//
//    @Override
//    public String what() {
//        return "Percussion";
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("adjusting percussion");
//    }
//}
//class Stringed extends Instrument{
//    @Override
//    public String what() {
//        return "Stringed";
//    }
//
//    @Override
//    public void play(Note n) {
//        System.out.println("Stringed.play()" + n);
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("adjusting stringed");
//    }
//}
//
//class Brass extends Wind{
//    @Override
//    public void play(Note n) {
//        System.out.println("Brass.play()" + n);
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("adjusting Brass");
//    }
//}
//
//class Woodwind extends Wind{
//    @Override
//    public void play(Note n) {
//        System.out.println("Woodwind.play()" + n);
//    }
//
//    @Override
//    public String what() {
//        return "Woodwind";
//    }
//}
//
//public class Music4 {
//
//    //不关心类型，所以加入系统的新类型也能工作
//    static void tune(Instrument i){
//        i.play(Note.MIDDLE_C);
//    }
//
//    static void tuneAll(Instrument[] e){
//        for (Instrument i : e)
//            tune(i);
//    }
//
//    public static void main(String[] args) {
//
//        //在数组填充期间会向上转型
//        Instrument[] orchestra = {
//
//                new Wind(),
//                new Percussion(),
//                new Stringed(),
//                new Brass(),
//                new Woodwind()
//
//        };
//        tuneAll(orchestra);
//    }
//
//
//}

package chapter6;

/**
 * @description 使用this调用构造器
 * @author: RicksonYu
 * @create: 2025年-01月-12日--15:54
 */
public class Flower {

    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){

        petalCount = petals;
        System.out.println("Constructor w/ int arg only," +
                "petalCount="+petalCount);

    }

    Flower(String ss){
        System.out.println(
                "Constructor w/ String arg only, s = " +ss

        );
        s = ss;
    }

    Flower(String s, int petals){
        this(petals);
        // - this(s); // 不能同时调用两个构造器
        this.s = s;
        System.out.println("String and int args");
    }

    Flower(){
        this("hi", 47);
        System.out.println("zero-argument constructor");
    }

    void printPetalCount(){
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-27日--16:32
 */

interface One {
    default void first(){
        System.out.println("first");
    }
}

interface Two{
    default void second(){
        System.out.println("second");
    }
}

interface Three{
    default void third(){
        System.out.println("third");
    }
}

class MI implements One,Two,Three{}

public class MultipleInheritance {

    public static void main(String[] args) {
        MI mi = new MI();
        mi.first();
        mi.second();
        mi.third();
    }

}

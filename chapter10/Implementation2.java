package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-27日--16:24
 */
public class Implementation2 implements AnInterface{
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        AnInterface i = new Implementation2();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}

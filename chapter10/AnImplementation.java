package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-27日--16:20
 */
public class AnImplementation implements AnInterface{
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {

        AnInterface i = new AnImplementation();
        i.firstMethod();
        i.secondMethod();
    }
}

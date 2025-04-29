package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-27日--16:35
 */

class D{}
abstract class E{}

class Z extends D{
    E makeE() {
        return new E(){};
    }
}

public class MultiImplementation {

    static void takesD(D d){};
    static void takesE(E e){};

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}

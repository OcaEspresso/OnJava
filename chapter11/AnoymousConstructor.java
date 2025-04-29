package chapter11;

/**
 *  @description
 *  @author: RicksonYu
 *  @create: 2025年-04月-27日--12:18
 */

abstract class Base{
    Base(int i){
        System.out.println("Base constructor,   i" + i);
    }
    public abstract void f();
}

public class AnoymousConstructor {

    public static Base getBase(int i) {
        return new Base(i){
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("Inside instance f");
            }
        };
    }

    public static void main(String[] args) {
        Base base =getBase(47);
        base.f();
    }

}

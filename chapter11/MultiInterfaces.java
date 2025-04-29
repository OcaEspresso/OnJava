package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-27日--15:55
 */

interface A{}
interface B{}

class X implements A, B{}

class Y implements A{
    B makeB(){
        //匿名内部类
        return new B(){};
    }
}

public class MultiInterfaces {
    static void takeA(A a){}
    static void takeB(B b){}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeA(y);
        takeB(x);
        takeB(y.makeB());
    }

}

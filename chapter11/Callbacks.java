package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-27日--16:48
 */

interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{

    private int i;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {

    public void increment() {
        System.out.println("other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }

}

//如果我们的类必须以其他某种方式实现Increment()
//则必须使用内部类

class Callee2 extends MyIncrement{

    private int i = 0;
    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    public class Closure implements Incrementable{

        @Override
        public void increment() {
            // 需要指定调用外围类方法，否则会无限递归
            Callee2.this.increment();
        }
    }

    Incrementable getCallBackInference() {
        return new Closure();
    }



}



class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable chh) {
        callbackReference = chh;
    }

    void go(){ callbackReference.increment();}
}



public class Callbacks {

        public static void main(String[] args) {

            Callee1 c1 = new Callee1();
            Callee2 c2 = new Callee2();
            MyIncrement.f(c2);
            Caller caller1 = new Caller(c1);
            Caller caller2 = new Caller(c2.getCallBackInference());

            caller1.go();
            caller1.go();
            caller2.go();
            caller2.go();

        }

    }

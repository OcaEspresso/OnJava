package chapter6;

/**
 * @description 静态子句里的显示静态初始化
 * @author: RicksonYu
 * @create: 2025年-01月-18日--16:08
 */

class Cup{

    Cup(int marker){

        System.out.println("Cup(" +marker+ ")");

    }

    void f(int marker)
    {
        System.out.println("f(" + marker + ")");
    }
}

class Cups{

    static Cup cup1;
    static Cup cup2;

    static {

        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups(){
        System.out.println("Cups()");
    }


}

public class ExpliciStatic {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
}

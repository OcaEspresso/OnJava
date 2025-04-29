package chapter6;

/**
 * @description 根据参数顺序来重载方法
 * @author: RicksonYu
 * @create: 2025年-01月-09日--15:44
 */
public class OverloadingOrder {

    static void f(String s, int i)
            { System.out.println("String: "+ s +  " int: "+i); }
    static void f( int i,String s)
    { System.out.println("int: "+i+" String: "+ s); }
    public static void main(String[] args) {

        f("String first", 11);
        f(11,"int first");
    }
}

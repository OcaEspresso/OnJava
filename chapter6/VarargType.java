package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-18日--20:34
 */
public class VarargType {

    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}

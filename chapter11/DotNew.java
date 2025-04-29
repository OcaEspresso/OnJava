package chapter11;

/**
 * @description 使用.new语法直接创建一个内部类的对象
 * @author: RicksonYu
 * @create: 2025年-03月-11日--01:44
 */
public class DotNew {
    public class Inner{

    }

    public static void main(String[] args) {

        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        System.out.println(dni);
    }
}

package chapter11;

/**
 * @description 访问外部类对象
 * @author: RicksonYu
 * @create: 2025年-03月-11日--01:34
 */
public class DotThis {
    void f() { System.out.println("DotThis.f()");}
    public class Inner{
       public DotThis outer(){
           return DotThis.this;
       }
    }
    public Inner inner(){ return new Inner(); }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}

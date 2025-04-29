package chapter11;

/**
 *  @description
 *  @author: RicksonYu
 *  @create: 2025年-04月-27日--15:41
 */


class MNA{
    private void f(){}
    class A{
        private void g(){}
        public class B{
            void h(){
                g();
                f();
            }
        }
    }
}
public class MultiNestingAccess {

    public static void main(String[] args) {
    MNA mna = new MNA();
    MNA.A mnaa = mna.new A();
    MNA.A.B mnab = mnaa.new B();
    mnab.h();
    }
}

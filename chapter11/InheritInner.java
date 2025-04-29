package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-29日--01:40
 */

class WithInner{
    class Inner{}
}
public class InheritInner extends WithInner.Inner{

    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi  = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}

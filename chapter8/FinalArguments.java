package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-26日--16:59
 */

class Gizmo{
    public void spin(){}
}
public class FinalArguments {

    void with(final Gizmo g){
       // g = new Gizmo(); illegal ,g is final
    }

    void without(Gizmo g) {
       g = new Gizmo();// ok ,g not final
       g.spin();
    }
    //void f(final int i){ i++;}  can not change final value

    //you cna only make read action with a final part
    int g(final int i) { return i +1;} // is use i, not change i,you can use it

    public static void main(String[] args) {
        FinalArguments f = new FinalArguments();
        f.without(null);

        f.with(null);
    }

}

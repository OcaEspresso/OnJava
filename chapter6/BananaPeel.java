package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-11日--17:46
 */
class Banana {

    void peel(int i){
        System.out.println("BananaPeel.func()" + i);
    }

}
public class BananaPeel {


    public static void main(String[] args) {

        Banana a = new Banana(),
                b = new Banana();
        a.peel(1);
        b.peel(2);



    }






}

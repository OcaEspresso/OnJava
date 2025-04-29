package chapter7;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-22日--21:22
 */

class Sundae{

    private Sundae(){

    }
    static Sundae makeASundae(){
        return new Sundae();
    }
}
public class IceCreeam {

    public static void main(String[] args) {

       // Sundae x  = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}

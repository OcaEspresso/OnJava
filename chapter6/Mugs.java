package chapter6;

/**
 * @description  实例化子句在构造器之前发生
 * @author: RicksonYu
 * @create: 2025年-01月-18日--17:15
 */
class Mug{

    Mug(int marker){
        System.out.println("Mug(" + marker + ")");
    }

}

public class Mugs {
    Mug mg1;
    Mug mg2;
    {
        mg1 = new Mug(1);
        mg2 = new Mug(2);
        System.out.println("mg1 & mg2 initialized");
    }

    Mugs(){

        System.out.println("Mugs()");
    }
    Mugs(int i){
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {

        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}

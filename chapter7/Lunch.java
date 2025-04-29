package chapter7;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-22日--21:34
 */

class Soup1{

    private Soup1(){}

    public static Soup1 makeSoup(){
        return new Soup1();
    }

}

class Soup2{

    private Soup2(){}

    //单例模式
    private static Soup2 ps1 = new Soup2();

    public static Soup2 access(){
        return ps1;
    }

    public void f(){}
}



public class Lunch {
}

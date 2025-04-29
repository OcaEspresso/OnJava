package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-24日--15:27
 */

class Soap{

    private String s;
    Soap(){

        System.out.println("Soap()");
        s = "Constructed";

    }
    @Override
    public String toString(){
        return s;
    }

}


public class Bath {

    private String  //在定义时初始化
            s1 = "Happy",
            s2 = "Happy",
            s3,s4;

    private Soap castille;
    private int i;
    private float toy;
    public Bath(){

        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    //实例初始化 , 在构造函数之前
    {
        i = 47;
    }

    @Override
    public String toString(){

        if(s4 == null)
            s4 = "Joy";
        return
                "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }

    public static void main(String[] args) {

        Bath b = new Bath();
        System.out.println(b);

    }

}

/***
 * 这个例子的核心要点
 * 变量的初始化顺序： 学会如何初始化类的成员变量，包括默认值、显式初始化、实例初始化块和构造器的顺序。
 *
 * 重写 toString() 的重要性： 重写 toString() 可以更直观地表示对象的内容，尤其在调试时非常有用。
 *
 * 对象之间的关系： Bath 和 Soap 的组合展示了对象可以包含其他对象，这是面向对象编程的基础。
 *
 *
 *
 * **/
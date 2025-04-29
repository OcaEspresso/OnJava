package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-09日--15:17
 */
class Rock{

    Rock(){
        //构造器
        System.out.println("Rock");
    }

}

public class SimpleConstructor {

    public static void main(String[] args) {
        for(int i =0;i < 10; i++)
            new Rock();
    }
}

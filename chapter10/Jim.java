package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-29日--09:58
 */

interface Jim1{
    default void jin(){
        System.out.println("jim1::jim");
    }
}

interface Jim2{
    default void jin(){
        System.out.println("jim2::jim");
    }
}

public class Jim implements Jim1,Jim2{
    @Override
    public void jin() {
       Jim2.super.jin();
    }

    public static void main(String[] args) {
        new Jim().jin();
    }
}

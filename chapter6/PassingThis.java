package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-11日--19:03
 */

class Person{

    public void eat(Apple apple){

        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");

    }
}

class Apple{

    Apple getPeeled() { return Peeler.peel(this);}

}

class Peeler{

    static Apple peel(Apple apple){
        //....削皮
        return apple; //削皮后的
    }

}

public class PassingThis {

    public static void main(String[] args) {

        new Person().eat(new Apple());
    }
}

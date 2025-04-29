package chapter6;


import onjava.Nap;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-16日--15:45
 */

class Book{

    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }


    void checkIn(){
        checkedOut = false;
    }

    @SuppressWarnings("deprecation")
    @Override public void finalize()
    {
        System.out.println("Error : checked out");
    }
}

public class TerminationCondition {
    public static void main(String[] args) {

        Book nnovel = new Book(true);



        //正确清理
        nnovel.checkIn();
        //没有清理就丢掉了该对象的引用
        new Book(true);
        //强制垃圾收集和终结操作
        System.gc();
        new Nap(1);

    }
}

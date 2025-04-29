package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-24日--16:28
 */

class Art{

    Art(){

        System.out.println("Art constructor");

    }
}

class Drawing extends Art{

    Drawing(){

        System.out.println("Drawing constructor");

    }
}



public class Cartoon extends Drawing{

    public Cartoon() {
        super(); // 明确调用基类的无参构造器
        System.out.println("Cartoon constructor");
    }


//    public Cartoon(){
//        System.out.println("Cartoon constructor");
//    }

    public static void main(String[] args) {
      Cartoon x = new Cartoon();
    }
}

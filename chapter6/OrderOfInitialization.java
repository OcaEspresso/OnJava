package chapter6;

/**
 * @description 演示初始化顺序
 * @author: RicksonYu
 * @create: 2025年-01月-17日--16:39
 */


class Window{
    //构造器初始化
    Window(int marker){
        System.out.println("Window(" + marker + ")");
    }
}

class House{

    Window w1 = new Window(1); // 在构造器之前

    House(){
        System.out.println("House()");
        w3 = new Window(33); //重新初始化w3
    }

    Window w2 = new Window(2); //在构造器之后
    void f(){
        System.out.println("f()");
    }

    Window w3 = new Window(3); //在尾部


}

public class OrderOfInitialization {

    public static void main(String[] args) {

        House h = new House();

        h.f(); //提示构造过程结束

    }

}

package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--12:42
 */
public class Shapes {

    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        //执行多态方法调用
        for(Shape shape: gen.array(9))
            shape.draw();
    }
}

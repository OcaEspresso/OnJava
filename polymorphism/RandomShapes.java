package polymorphism;

import java.util.Random;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--12:11
 */
public class RandomShapes {

    private Random rand = new Random(47);

    public Shape get() {
        switch (rand.nextInt(3)) {

            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();

        }


}

    public Shape[] array(int sz) {

        Shape[] shapes = new Shape[sz];
        //用各种形状填满数组
        for (int i = 0; i < shapes.length; i++)

            shapes[i] = get();
        return shapes;

    }

    }



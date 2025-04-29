package chapter12_Collections;

import java.util.ArrayList;

/**
 * @description 简单集合类的使用
 * @author: RicksonYu
 * @create: 2025年-04月-29日--17:00
 */

class Apple{
    private static long counter;
    private final long id = counter++;

    public long id() { return id; }
}

class Orange{

}

public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList Apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            Apples.add(new Apple());
        Apples.add(new Orange());

        for(Object apple:Apples)
            ((Apple) apple).id();
    }
}

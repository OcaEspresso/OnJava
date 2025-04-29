package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-27日--16:12
 */
interface Concept{ // 不加public,自动获得包访问权限

    void idea1();
    void idea2();
}

public class ImplementingAnInterface implements Concept{
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}

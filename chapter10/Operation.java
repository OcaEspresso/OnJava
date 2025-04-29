package chapter10;

/**
 * @description  接口中的静态方法
 * @author: RicksonYu
 * @create: 2025年-01月-29日--10:12
 */
public interface Operation {

    void excute();
    static void runOps(Operation... ops){
        for(Operation op : ops)
            op.excute();

    }

    static void show(String msg){
        System.out.println(msg);
    }
}

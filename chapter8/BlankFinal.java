package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-26日--16:43
 */

class Poppet{

    private int i;
    Poppet(int ii){
        i = ii;
    }
}

public class BlankFinal {

    private final int i =0; //初始化了的final
    private final int j;
    private final Poppet p;//空白final引用

    // 空白final字段必须在构造器里初始化
    public BlankFinal(){
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x){
         j = x;//初始化空白
         p = new Poppet(x);//初始化空白final引用
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

package Chapter4;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-05日--19:05
 */
public class Casting {

    public static void main(String[] args) {

        int i = 200;
        long lng = (long) i;
        lng = i;//进行宽化，因此不需要强转
        long lng2 = (long)200;
        lng2 = 200;

        //一个窄化转型
        i = (int)lng2;


    }
}

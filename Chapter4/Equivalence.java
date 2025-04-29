package Chapter4;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-04日--07:29
 */
public class Equivalence {

    static void show(String desc, Integer n1 , Integer n2){

        System.out.println(desc + ":");
        System.out.printf(
         "%d==%d %b %b%n", n1 ,n2 , n1 == n2, n1.equals(n2)
        );
    }

    @SuppressWarnings("deprecation")
    public static void test(int value){

        Integer i1 = value; //自动转换
        Integer i2 = value;
        show("automatic", i1, i2);

        Integer r1 = new Integer(value);
        Integer r2 = new Integer(value);
        show("new Integer", r1, r2);

        //java 9及以上提倡的方式

        Integer v1 =  Integer.valueOf(value);
        Integer v2 =  Integer.valueOf(value);
        show("Integer.valueOf()", v1, v2);
        //基本类型不能使用equals()方法
        int x = value;
        int y = value;
        // x.equals(y); Cannot call method because 'x' has primitive type int
        System.out.println("primitive int:");
        System.out.printf(
                "%d==%d %b%n", x ,y , x == y
        );


    }

    public static void main(String[] args) {
        test(127);
        test(128);
    }
}

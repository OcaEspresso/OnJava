package chapter8;

import java.util.Arrays;
import java.util.Random;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-26日--15:37
 */

class Value{
    int i;//包访问权限
    Value(int i){ this.i = i;}
}
public class FinalData {

    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) { this.id = id;}

    //可以是编译时常量
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    //典型的公共常量
    public static final int VALUE_THREE = 39;

    //这些不能作为编译时常量
    private final int i4  = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    // 数组:
    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //fd1.valueOne++;  Cannot assign a value to final variable 'valueOne'
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }

        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}

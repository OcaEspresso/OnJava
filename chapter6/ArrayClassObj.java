package chapter6;

import java.util.Arrays;
import java.util.Random;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-18日--18:18
 */
public class ArrayClassObj {

    public static void main(String[] args) {

        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);

        for(int i = 0; i < a.length;i++)
            a[i] = rand.nextInt(500);//自动装箱
        System.out.println(Arrays.toString(a));

    }





}

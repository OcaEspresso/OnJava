package chapter5controller;
import java.util.*;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-09日--08:50
 */
public class ForInFloat {

    public static void main(String[] args) {
        Random random = new Random(47);
        float[] f = new float[10];
        for(int i = 0;i < 10; i++)
            f[i] = random.nextFloat();
        for(float x : f)
            System.out.println(x);
    }







}

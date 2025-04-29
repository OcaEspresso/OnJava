package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-18日--17:38
 */
public class ArraysOfPrimitives {

    public static void main(String[] args) {


        int[] a1 = {1,2,3,4,5};
        int[] a2;
        a2 = a1;
        for(int i = 0; i < a2.length;i++)
            a2[i] += 1;
        for(int i = 0; i < a1.length;i++)
            System.out.println("a1["+i+"]="+a1[i]);





    }
}

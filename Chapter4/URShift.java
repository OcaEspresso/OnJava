package Chapter4;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-05日--17:00
 */
public class URShift{

    public static void main(String[] args) {

        int i = -1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));

        long l = -1;
        System.out.println(Long.toBinaryString(l));

        l >>>= 10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println("before move 10 bits : "+Integer.toBinaryString(s).length());


        s >>>= 10;
        System.out.println("after move 10 bits : "+Integer.toBinaryString(s).length());

        byte b = -1;
        System.out.println(Integer.toBinaryString(b));

        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));

        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));


    }

}

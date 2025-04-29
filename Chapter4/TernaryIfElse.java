package Chapter4;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-05日--18:10
 */
public class TernaryIfElse {

    static int ternary(int i)
    {
        return i < 10 ? i * 100 : i *10;

    }

    //还是三元简洁些
    static int standardIfElse(int i)
    {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args)
    {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }

}

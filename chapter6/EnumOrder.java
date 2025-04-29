package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-18日--21:54
 */
public class EnumOrder {

    public static void main(String[] args) {

        for(Spiciness s: Spiciness.values())
            System.out.println(s +", ordinal " + s.ordinal());
    }
}

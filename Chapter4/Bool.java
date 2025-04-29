package Chapter4;
import java.util.*;
/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-05日--06:24
 */
public class Bool {

    public static void main(String[] args) {
        Random random = new Random(47);
        int i = random.nextInt(100);
        int j = random.nextInt(100);

        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
        System.out.println("i > j is " + (i > j));
    }
}

package chapter5controller;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-08日--18:14
 */
public class ListCharacters {
    public static void main(String[] args) {
        for(char c =0; c <=128; c++)
            if(Character.isLowerCase(c))
                System.out.println("value: " + (int)c+
                        " character: "+c);
    }
}

package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-18日--18:28
 */
public class DynamicArray {

    public static void main(String[] args) {

        Other.main(new String[] {"fiddle","de","dum"});
    }
}

class Other{
    public static void main(String[] args) {

        for(String s:args)
            System.out.println(s + " ");
    }

}
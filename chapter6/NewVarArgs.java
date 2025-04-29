package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-18日--19:27
 */
public class NewVarArgs {

    static void printArray(Object... args){

        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();


    }

    public static void main(String[] args) {
        printArray(new Object[]{47,(float)3.14,11.11});
        printArray(new Object[]{"one","two","three"});
        printArray(new Object[]{new A(),new A(),new A()});

        printArray((Object[]) new Integer[]{1,2,3,4});
        printArray();
    }
}



package chapter5controller;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-09日--09:59
 */
public class ForInString {

    public static void main(String[] args) {

        for(char c :"An African Swallow".toCharArray())
            System.out.println(c + " ");

    }

}

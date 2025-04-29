package chapter5controller;

import static onjava.Range.range;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-09日--10:39
 */
public class BreadAndContinue {

    public static void main(String[] args) {

        for (int i =0; i < 100; i++)
        {
            if(i == 74) break;//跳出for循环
            if (i % 9 != 0) continue;//重新开始循环
            System.out.print(i + " ");
        }
        System.out.println();
        //使用for-in
        for(int i : range(100)) {
            if(i == 74) break;//跳出for循环
            if (i % 9 != 0) continue;//重新开始循环
            System.out.print(i + " ");
        }

        System.out.println();
        int i =0;

        //一个无限循环
        while(true){

            i++;
            int j = i * 27;
            if(j == 1269) break;//跳出循环
            if(i % 10 != 0) continue; //跳到循环顶部
            System.out.print(i + " ");
        }

    }
}

package chapter5controller;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-09日--11:34
 */
public class LabeledFor {

    public static void main(String[] args) {

        int i = 0;
        outer:
        for (; true;){
            inner:
            for (; i < 10; i++){
                System.out.println("i = " + i);
                if(i == 2){
                    System.out.println("continue");
                    continue;
                }
                if(i == 3){
                    System.out.println("break");
                    i++;
                    break;
                }
                if(i == 7){
                    System.out.println("continue outer");
                    i++;
                   continue outer;
                }
            }
        }

    }
}

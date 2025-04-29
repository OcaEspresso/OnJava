package Chapter4;

/**
 * @description 默认的equals()方法并不是比较内容的
 * @author: RicksonYu
 * @create: 2025年-01月-05日--06:04
 */
 class ValA {
    int i;
}

class ValB{
    int i;
    public boolean equals(Object o){
        ValB rval = (ValB)o;

        return i == rval.i;
    }
}

public class EqualsMethod {


    public static void main(String[] args) {

        ValA va1 = new ValA();
        ValA va2 = new ValA();
        va1.i = va2.i = 100;
        System.out.println(va1.equals(va2));

        ValB vb1 = new ValB();
        ValB vb2 = new ValB();
        vb1.i = vb2.i = 100;
        System.out.println(vb1.equals(vb2));
    }




}

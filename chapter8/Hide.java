package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-25日--22:32
 */

class Homer{

    char doh(char c) {
        System.out.println("doh " + c);
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh " + f);
        return 1.0f;
    }
}

class Milhouse { }

class Bart extends Homer{
    void aoh(Milhouse m){
        System.out.println("Bart.aoh()");
    }
}

//class Lisa extends Homer{
////    @Override void aoh(Milhouse m){
////        System.out.println("Lisa.aoh()");
//    }
//}

public class Hide {
    public static void main(String[] args) {

        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.aoh(new Milhouse());
    }
}

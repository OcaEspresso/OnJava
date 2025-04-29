package chapter11;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-29日--01:47
 */

class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk()");
        }
    }

    Egg(){
        System.out.println("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg{

    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}

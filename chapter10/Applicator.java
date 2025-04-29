package chapter10;

import java.util.Arrays;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-30日--20:49
 */

class Processor{

    public String name(){
        return getClass().getSimpleName();
    }

    public Object process(Object input){
        return input;
    }

}


class Upcase extends Processor{

    @Override //协变返回
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends Processor{


    @Override
    public Object process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{

    //split 方法把字符串分成几部分
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Applicator {

    public static void apply(Processor p, Object s){

        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {

        String s =  "We are such stuff as dreams are made on";
        apply(new Upcase(),s);
        apply(new DownCase(),s);
        apply(new Splitter(),s);

    }
}

package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-03月-11日--01:46
 */
public class Parcel3 {

    class Contents{
        private int i = 11;
        public int value(){ return i;}
    }

    class Destination{
        private String label;
        Destination(String whereTo){ label =  whereTo;}
        String readLabel(){return label;}
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        //必须使用外部类的实例
        //来创建内部类的实例
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d =
                p.new Destination("Tasmania");
    }
}

//如果创建的是嵌套类，就不需要指向外部类对象的引用

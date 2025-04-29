package chapter11;

/**
 *  @description 带参数的基类构造
 *  @author: RicksonYu
 *  @create: 2025年-04月-27日--12:01
 */
public class Parcel8 {

    public Wrapping wrapping(int x){
        //带参数的基类构造器
       return new Wrapping(x){
           @Override
           public int value(){
               return super.value() * 47;
           }
       };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w  = p.wrapping(10);
        System.out.println(w.value());
    }
}

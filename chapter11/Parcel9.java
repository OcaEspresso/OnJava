package chapter11;

/**
 *  @description
 *  @author: RicksonYu
 *  @create: 2025年-04月-27日--12:13
 */
public class Parcel9 {

    public Destination destination(final String dest)
    {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        }; //表达式结束
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }

}

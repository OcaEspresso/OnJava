package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-27日--11:42
 */
public class Parcel7 {

    public Contents contents()
    {
        return new Contents() {

            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}

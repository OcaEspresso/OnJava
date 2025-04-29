package chapter11;

/**
 * @description 创建内部类
 * @author: RicksonYu
 * @create: 2025年-02月-25日--11:17
 */
public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLable(){ return label;}
    }

    //in parcell inner,use the inner class
    //seems like use the other normal class.
    public void ship(String dest)
    {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLable());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }

}

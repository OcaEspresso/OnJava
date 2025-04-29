package chapter8;

/**
 * @description 继承后调用父类方法
 * @author: RicksonYu
 * @create: 2025年-01月-25日--19:26
 */
public class DerivedSpaceShip extends SpaceShipControls{

    private String name;
    public DerivedSpaceShip(String name){

        this.name = name;

    }

    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        DerivedSpaceShip protector = new DerivedSpaceShip("NSEA Protector");
        protector.forward(100);
    }
}

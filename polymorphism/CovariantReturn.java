package polymorphism;

/**
 * @description  协变返回类型
 * @author: RicksonYu
 * @create: 2024年-12月-20日--15:20
 */

class Grain{

    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain{
    @Override
    public String toString() {
        return "Wheat";
    }
}

class  Mill{
    Grain Process(){

        return new Grain(); }
}


class WheatMill extends Mill{
    @Override
    Grain Process() {
        return new Wheat();
    }
}
public class CovariantReturn {

    public static void main(String[] args) {

        Mill m = new Mill();
        Grain g = m.Process();
        System.out.println(g);

        m = new WheatMill();
        g =  m.Process();
        System.out.println(g);

    }
}

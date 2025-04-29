package chapter10;

/**
 * @description 通过继承来扩展接口
 * @author: RicksonYu
 * @create: 2025年-02月-05日--15:44
 */

interface Monster{
    //恐吓
    void menace();
}

interface DamgerousMonster extends Monster{
    void destroy();
}


interface Lethal{
    void killer();
}

public class HorrorShow {
}

package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-27日--16:34
 */

interface Bob1{
    default void bob(){
        System.out.println("Bob1::bob");
    }
}


interface Bob2{
    default void bob(){
        System.out.println("Bob2::bob");
    }
}
//implements

//class Bob implements Bob1,Bob2{}bob1和bob2有两个相同的默认方法
interface Sam1{
    default void sam(){
        System.out.println("Sam1::sam");
    }
}

interface Sam2{
    default void sam(int i){
        System.out.println(i * 2);
    }
}
class Sam implements Sam1,Sam2{}
//这里能正常工作是因为参数列表不同

interface Max1{
    default void max(){
        System.out.println("Max1::max");
    }
}

interface Max2{
    default int max(){
        return 47;
    }
}

//class Max implements Max1,Max2{}

public class MICollision {



}

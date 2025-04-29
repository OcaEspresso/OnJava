package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-02月-03日--14:28
 */
public interface Process_Remake {

    default String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input);

}


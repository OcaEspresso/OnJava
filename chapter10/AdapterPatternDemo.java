package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-02月-03日--15:46
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        OldLogger oldLogger = new OldLogger();
        Logger logger = new LoggerAdapter(oldLogger);


        logger.log("This is a log message");

    }

}

package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-02月-03日--15:44
 */
public class LoggerAdapter implements Logger{

    private OldLogger oldLogger;

    public LoggerAdapter(OldLogger oldLogger)
    {
        this.oldLogger = oldLogger;
    }


    @Override
    public void log(String message) {
        oldLogger.writeLog(message); //适配方法调用
    }
}

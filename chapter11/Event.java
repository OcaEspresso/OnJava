package chapter11;

import java.time.Duration;
import java.time.Instant;

/**
 * @description 用于控制任何事件的公共方法
 * @author: RicksonYu
 * @create: 2025年-04月-27日--17:13
 */

public abstract class Event{

    private Instant eventTime;
    protected final Duration delayTime;
    public Event(long millisecondDelay){
        this.delayTime = Duration.ofMillis(millisecondDelay);
        start(); //逻辑
    }

    public void start(){
        eventTime = Instant.now().plus(delayTime);
    }

    public boolean ready(){
        return Instant.now().isAfter(eventTime);
    }

    public abstract void action();
}




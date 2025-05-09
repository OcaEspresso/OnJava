package chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 用于控制系统的可复用框架
 * @author: RicksonYu
 * @create: 2025年-04月-27日--17:22
 */
public class controller {

    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){ eventList.add(c); }

    public void run(){
        while(eventList.size() > 0)
            for(Event e: new ArrayList<>(eventList))
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);

                }

    }

}

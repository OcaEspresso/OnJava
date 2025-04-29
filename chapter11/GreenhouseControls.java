package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-27日--17:32
 */
public class GreenhouseControls extends controller{

    private boolean light= false;
    public class LightOn extends Event{

        public LightOn(long delaytime){
            super(delaytime);
        }

        @Override
        public void action() {
          // 将硬件控制代码放在这里
          //实际是开灯
          light = true;
        }

        @Override public String toString(){
            return "Light is on";
        }

    }

    public class LightOff extends Event{
        public LightOff(long delayTime)
        {
            super(delayTime);
        }
        @Override
        public void action() {
            light = false;
        }
        @Override public String toString(){
            return "Light is off";
        }
    }

    private boolean water = false;
    public class WaterOn extends  Event{

        public WaterOn(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action() {
            // 硬件控制代码
            water = true;
        }

        @Override public String toString(){return "Greenhouse water is on";}


    }

    public class WaterOff extends  Event{

        public WaterOff(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override public String toString(){return "Greenhouse water is off";}
    }

    private String thermostat = "Day";
    public class THermostatNight extends  Event{

        public THermostatNight(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action() {
                thermostat = "Day";
        }
        @Override public String toString(){return "thermostat on day setting";}
    }

    // action()的一个例子，向事件中插入一个新的相同事务
    public class Bell extends Event{

        public Bell(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime.toMillis()));
        }
        @Override public String toString(){return "Bing!";}
    }

    public class Restart extends Event{

        private Event[] eventList;
        public
        Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList){
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for(Event e : eventList){
                e.start(); //重新运行每个事件
                addEvent(e);
            }

            start();// 重新运行该事件
            addEvent(this);
        }
        @Override public String toString(){return "Restartint system";}
    }

    public static class Terminate extends Event{

        public Terminate(long delayTime)
        {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }
        @Override public String toString(){return "Terminating";}
    }
}

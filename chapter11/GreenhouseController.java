package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-29日--01:36
 */
public class GreenhouseController {

    public static void main(String[] args) {

        GreenhouseControls gc = new GreenhouseControls();

        gc.addEvent(gc.new Bell(900));
        Event[] evenList = {

                gc.new THermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
//                gc.new There
        };

    }
}

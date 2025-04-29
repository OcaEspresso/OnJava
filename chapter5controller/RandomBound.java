package chapter5controller;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class RandomBound {
    public static void main(String[] args) {

        new TimedAbort(3);
        switch(args.length == 0 ? "":args[0])
        {
            case "lower":
                while(Math.random() != 0.0)
                    ;//持续尝试
                System.out.println("Produced 0.0");
                break;
            case "upper":
                while(Math.random() != 1.0)
                    ;//持续尝试
                System.out.println("Produced 1.0!");
                break;
            default:
                System.out.println("Usage:");
                System.out.println("\tRandomBounds lower");
                System.out.println("\tRandomBounds upper");
                System.exit(1);
        }
    }
}

class TimedAbort {
    private volatile boolean restart = true;
    public TimedAbort(double t, String msg) {
        CompletableFuture.runAsync(() -> {
            try {
                while(restart) {
                    restart = false;
                    TimeUnit.MILLISECONDS
                            .sleep((int)(1000 * t));
                }
            } catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(msg);
            System.exit(0);
        });
    }
    public TimedAbort(double t) {
        this(t, "TimedAbort " + t);
    }
    public void restart() { restart = true; }
}


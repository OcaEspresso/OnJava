package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-20日--07:47
 */

class Parcel4 {

    private class Pcontents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected final class PDestination implements Destination {

        private String label;

        public PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

        public Destination destination(String s) {

            return new PDestination(s);
        }

        public Contents contents() {
            return new Pcontents();
        }
    }


public class TestParcel {
    public static void main(String[] args) {

        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");


       // Parcel4.PDestination pc = p.new Pcontents();

    }
}



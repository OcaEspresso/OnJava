package polymorphism;

/**
 * @description  清理与继承
 * @author: RicksonYu
 * @create: 2024年-12月-19日--13:39
 */

class Characteristic {
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic "+s);
    }
    protected void dispose(){
        System.out.println("disposing Characteristic "+s);
    }
}


class Description{

    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Creatiing Description "+ s);
    }

    protected void dispose(){

        System.out.println("disposing Description "+s);
    }

}

class LivingCreature{

    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose(){
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }

}


class Animal extends LivingCreature {

    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");

    Animal(){
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("Anima dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }


}

class Amphibian extends Animal{

    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("both water and land");

    Amphibian(){

        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }


}


public class Frog extends Amphibian{


    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");
    public Frog(){

        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {

        Frog frog = new Frog();
        System.out.println("Bye");

        frog.dispose();
    }

}

package polymorphism;

/**
 * @description  构造器和多态，不会生成你想要的结果
 * @author: RicksonYu
 * @create: 2024年-12月-19日--16:58
 */


class Glyph {

    void draw(){
        System.out.println("Glyph.draw()");
    }

    Glyph(){

        System.out.println("Glypy before draw()");
        draw();
        System.out.println("Glyph after draw()");
    }

}

class RoundGlyph extends Glyph{
    private int radius =1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(),radius = " + radius);
    }
}

public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
    }


}

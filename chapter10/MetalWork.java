package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-29日--17:02
 */

class Heat implements Operation{
    @Override
    public void excute() {
        Operation.show("Heat"); //注意这里区分静态类.func()
    }
}

public class MetalWork {

    public static void main(String[] args) {

        //必须在静态上下文中定义，才能使用方法引用
        Operation twist = new Operation() {
            @Override
            public void excute() {
                Operation.show("twist");
            }
        };

        Operation.runOps(
                new Heat(),
                new Operation() {
                    @Override
                    public void excute() {
                        Operation.show("Hammer");
                    }
                },
                twist::excute,
                () ->Operation.show("Animal")
        );

    }




}

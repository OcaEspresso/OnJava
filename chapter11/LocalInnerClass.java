package chapter11;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-04月-29日--15:51
 */

interface Counter {
    int next();
}

public class LocalInnerClass {

    private int count = 0;

    Counter getCounter(final String name){
        //一个局部内部类
        class LocalCounter implements Counter {

            LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    //使用匿名内部类实现同样的功能
    Counter getCounter2(final String name){
        return new Counter() {
            //匿名内部类不能有具名的构造器
            // 只有一个实例初始化部分
            {
                System.out.println("LocalCounter2()");
            }

         @Override
         public int next() {
                System.out.print(name);
                return count++;
         }
        };

    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();

        Counter
                c1 = lic.getCounter("local inner"),
                c2 = lic.getCounter2("Anoymous inner");

        for (int i =0; i < 5; i++)
            System.out.println(c1.next());

        for (int i = 0; i < 5; i++)
            System.out.println(c2.next());

    }
}

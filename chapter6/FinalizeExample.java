package chapter6;

public class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize() method called.");
            // 模拟释放资源的操作
        } finally {
            super.finalize(); // 确保父类的 finalize() 方法被调用
        }
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example = null; // 将对象置为不可达，等待垃圾回收

        // 提醒垃圾回收器执行回收操作
        System.gc();

        System.out.println("End of main method");
    }
}
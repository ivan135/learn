package ch04;

/**
 * Created by zou on 2016/12/16.
 */
public class FinallyTest {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 20;
            int a = y / x;
            System.out.println("y/x的值" + a);
        } catch (ArithmeticException e) {
            System.out.println("捕获到算术异常：" + e);
        } finally {
            System.out.println("执行到finally块内！");
            try {
                String name = null;    //不会自动初始化，因为是对象
                if (name.equals("LXM")) {
                    System.out.println("你的名字叫LXM");
                }
            } catch (Exception e) {
                System.out.println("又捕获到另一个异常：" + e);
            } finally {
                System.out.println("执行到内层的 finally 块内");
            }
        }
    }
}

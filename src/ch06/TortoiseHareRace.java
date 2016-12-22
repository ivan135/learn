package ch06;

import static java.lang.System.out;

/**
 * Created by zou on 2016/12/22.
 */
public class TortoiseHareRace {
    public static void main(String[] args) {
        boolean[] flags = {true, false};
        int totalStep = 10;
        int tortoiseStep = 0;
        int hareStep = 0;
        out.println("龟兔赛跑开始...");//打印到客戶端
        while(tortoiseStep < totalStep && hareStep < totalStep) {
            tortoiseStep++;
            out.printf("乌龟跑了 %d 步...%n", tortoiseStep);
            boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];
            if(isHareSleep) {
                out.println("兔子睡着了zzzz");
            } else {
                hareStep += 2;
                out.printf("兔子跑了 %d 步...%n", hareStep);
            }
        }
    }
}
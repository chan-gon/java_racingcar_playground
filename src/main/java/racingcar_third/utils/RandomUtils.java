package racingcar_third.utils;

import java.util.Random;

public class RandomUtils {

    public static int getRandomNum() {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        return randomNum;
    }
}

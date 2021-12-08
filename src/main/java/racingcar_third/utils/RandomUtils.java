package racingcar_third.utils;

import java.util.Random;

public class RandomUtils {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 10;

    public static int getRandomNum() {
        Random random = new Random();
        int randomNum = random.nextInt(10);
        if (randomNum < MIN_VALUE || randomNum > MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        return randomNum;
    }
}

package racingcar_second.utils;

import java.util.Random;

public class RandomUtils {
    public static int generateRandomNum() {
        Random random = new Random();
        return random.nextInt(10);
    }
}

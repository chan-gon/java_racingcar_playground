package racingcar_third.utils;

import java.util.Random;

public class RandomNumUtil {

    public int generateRandomNum() {
        Random random = new Random();
        return random.nextInt(10);
    }
}

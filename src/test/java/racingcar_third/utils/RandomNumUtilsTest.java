package racingcar_third.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumUtilsTest {

    @Test
    void 랜덤숫자_0에서9_생성() {
        RandomNumUtils randomNumUtil = new RandomNumUtils();
        assertThat(randomNumUtil.generateRandomNum())
                .isGreaterThan(0)
                .isLessThan(10);
    }
}

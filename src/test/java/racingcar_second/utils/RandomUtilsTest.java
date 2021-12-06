package racingcar_second.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Test
    void 랜덤숫자는_0과_9사이() {
        assertThat(RandomUtils.generateRandomNum())
                .isGreaterThan(0)
                .isLessThan(9);
    }
}
package racingcar_third.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomUtilsTest {

    @Test
    void 랜덤숫자_0에서9범위_테스트() {
        RandomUtils rd = new RandomUtils();
        assertThat(rd.getRandomNum()).isGreaterThan(0).isLessThan(10);
    }
}

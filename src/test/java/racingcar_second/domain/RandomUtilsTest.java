package racingcar_second.domain;

import org.junit.jupiter.api.Test;
import racingcar_second.utils.RandomUtils;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Test
    void 랜덤값_0에서9사이_생성() {
        RandomUtils randomUtils = new RandomUtils();
        assertThat(randomUtils.generateRandomNum()).isGreaterThan(0).isLessThan(10);
    }
}
package racingcar_second.domain;

import org.junit.jupiter.api.Test;
import racingcar_second.domain.Name;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    void 자동차_이름_5글자_초과_금지_검증() {
        assertThatThrownBy(() -> new Name("lamborghini"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}

package racingcar_second;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar_second.domain.Name;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    private Name name;

    @BeforeEach
    void setUp() {
        name = new Name();
    }

    @Test
    void 자동차_이름_5글자_초과_금지_검증() {
        assertThatThrownBy(() -> new Name("lamborghini"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름_쉼표_구분_검증() {
        String input = "java1,java2,java3";
        assertThat(name.createNameList(input).size()).isEqualTo(3);
    }
}

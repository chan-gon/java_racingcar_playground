package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ValidatorTest {

    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @ParameterizedTest
    @CsvSource({"java, true", "mysql, true"})
    void 자동차_이름_길이_검증(String carName, boolean result) {
        assertThat(validator.carNameLengthCheck(carName)).isEqualTo(result);
    }

    @Test
    void 자동차_이름_길이_초과_예외_출력_검증() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
           String input = "lamborghini";
           validator.carNameLengthCheck(input);
        });
    }
}
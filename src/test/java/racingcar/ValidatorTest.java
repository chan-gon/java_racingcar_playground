package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidatorTest {

    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @ParameterizedTest
    @CsvSource({"java, true", "mysql, true", "lamborghini, false"})
    void 자동차_이름_길이_검증(String carName, boolean result) {
        assertThat(validator.carNameLengthCheck(carName)).isEqualTo(result);
    }

}
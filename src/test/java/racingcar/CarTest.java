package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @ParameterizedTest
    @CsvSource({"java, true", "mysql, true", "lamborghini, false"})
    void 자동차_이름_길이_검증(String carName, boolean result) {
        assertThat(car.carNameLengthCheck(carName)).isEqualTo(result);
    }

    @Test
    void 자동차_이름_쉼표로_구분() {
        String input1 = "java,mysql,bmw";
        assertThat(car.seperateCarName(input1).size()).isEqualTo(3);
        String input2 = "java,mysql,bmw,tesla,kia";
        assertThat(car.seperateCarName(input2).size()).isEqualTo(5);
    }

    @Test
    void 시도_회수_검증() {
        assertThat(car.racingLength(5).length()).isEqualTo(5);
    }
}

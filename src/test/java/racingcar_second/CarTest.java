package racingcar_second;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar_second.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void 자동차_이름_쉼표_구분_검증() {
        String input = "java1,java2,java3";

        assertThat(car.createNameList(input).size()).isEqualTo(3);
    }

    @Test
    void 값이_4이하일때_예외_검증() {
        int input = 3;
        assertThatThrownBy(() -> car.drive(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}

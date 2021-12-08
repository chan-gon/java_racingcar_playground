package racingcar_third.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    private Car car = new Car("java1");

    @Test
    void 값이_4이상일때_움직인다() {
        car.move(4);
        assertThat(car.getCarPosition()).isEqualTo(1);
    }

    @Test
    void 자동차이름_5글자_초과하면_안된다() {
        assertThatThrownBy(() -> new Car("java12345")).isInstanceOf(IllegalArgumentException.class);
    }
}

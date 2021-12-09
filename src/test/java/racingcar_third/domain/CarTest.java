package racingcar_third.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar();
    }

    @Test
    void 숫자_4이상이면_이동() {
        racingCar.move(4);
        assertThat(racingCar.getCarPosition()).isEqualTo(1);
    }

/*    @Test
    void 자동차이름_5글자이상_예외발생() {
        assertThatThrownBy(() -> new RacingCar("java12345")).isInstanceOf(IllegalArgumentException.class);
    }*/

    @Test
    void 자동차이름_쉼표제거하고_반환() {
        assertThat(racingCar.createCarList("java1,java2,java3").size()).isEqualTo(3);
    }
}

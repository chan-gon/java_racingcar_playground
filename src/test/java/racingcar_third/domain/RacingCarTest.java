package racingcar_third.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

class RacingCarTest {

    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar("java1");
    }

    @Test
    void 자동차이름_5글자초과하면_예외발생() {
        assertThatThrownBy(() -> new RacingCar("java12345"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자_4이상이면_이동() {
        racingCar.moveForward(4);
        assertThat(racingCar.getCarPosition()).isEqualTo(1);
    }

    @Test
    void 숫자_0이하_9이상이면_예외발생() {
        assertThatIllegalArgumentException().isThrownBy(() -> racingCar.moveForward(-1));
        assertThatIllegalArgumentException().isThrownBy(() -> racingCar.moveForward(10));
    }

    @Test
    void 이름이_같은자동차는_같은자동차이다() {
        RacingCar car1 = new RacingCar("911");
        RacingCar car2 = new RacingCar("911");
        assertThat(car1).isEqualTo(car2);
    }
}
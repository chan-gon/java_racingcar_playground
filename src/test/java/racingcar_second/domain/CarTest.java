package racingcar_second.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    private Car car = new Car("java1");

    @Test
    void 랜덤숫자_4_이상이면_이동() {
        car.moveForward(5);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 랜덤숫자_4_미만이면_이동안함() {
        car.moveForward(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차이름_5글자_넘기면안된다() {
        assertThatThrownBy(() -> new Car("abcdefg"))
                .isInstanceOf(IllegalArgumentException.class)
                .withFailMessage("자동차 이름은 5글자를 초과할 수 없습니다.");
    }
}
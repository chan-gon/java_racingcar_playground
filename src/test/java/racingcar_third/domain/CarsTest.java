package racingcar_third.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarsTest {

    @Test
    void 자동차이름_콤마_제거() {
        Cars cars = new Cars("java1,java2,java3");
        assertThat(cars.createCarList()).hasSize(3);
    }

    @Test
    void 자동차이름_공백_예외() {
        assertThatThrownBy(() -> new Cars(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차게임_승자_출력() {

    }
}

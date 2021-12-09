package racingcar_third.domain;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class RacingCarsTest {

    @Test
    void 자동차_입력되지않으면_예외발생() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new RacingCars(Collections.emptyList()));
    }

    @Test
    void 같은이름_자동차_중복제거() {
        RacingCars racingCars = new RacingCars(Lists.list(new RacingCar("car"), new RacingCar("car")));
        assertThat(racingCars.getCars()).hasSize(1);
    }

    @Test
    void 우승자_출력_테스트() {
        RacingCar car1 = makeTestCar("car1", 1);
        RacingCar car2 = makeTestCar("car2", 2);
        RacingCar car3 = makeTestCar("car3", 3);
        RacingCars racingCars = new RacingCars(Lists.list(car1, car2, car3));
        List<RacingCar> winners = racingCars.getWinners();
        assertThat(winners).containsOnly(car3);
    }

    private RacingCar makeTestCar(String name, int position) {
        RacingCar car = new RacingCar(name);
        for (int i = 0; i < position; i++) {
            car.moveForward(4);
        }
        return car;
    }
}
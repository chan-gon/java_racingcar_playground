package racingcar_second.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @Test
    void 콤마_제거하고_자동차리스트_만들기() {
        Cars cars = new Cars("java1,java2,java3");
        assertThat(cars.getCarList()).hasSize(3);
    }

    @Test
    void 레이싱_우승자동차_가져오기() {
        Cars cars = new Cars("java1,java2,java3");
        int position = 1;
        for (Car car : cars.getCarList()) {
            car.moveForward(++position);
        }
        List<String> winners = cars.getWinnerNames();
        System.out.println(winners);
        assertThat(String.join(",",winners)).isEqualTo("java3"); // java3의 position이 4가 되므로 java3만 움직인다
    }

    @Test
    void 자동차이름_가져오기() {
        Cars cars = new Cars("java1,java2,java3");
        List<String> carNames = cars.getCarList().stream()
                .map(Car::getName)
                .collect(Collectors.toList());
        assertAll(
                () -> assertThat(cars.getCarList()).hasSize(3),
                () -> assertTrue(carNames.contains("java1")),
                () -> assertTrue(carNames.contains("java2")),
                () -> assertTrue(carNames.contains("java3"))
                );
    }
}
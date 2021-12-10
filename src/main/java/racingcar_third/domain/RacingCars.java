package racingcar_third.domain;

import racingcar_third.utils.RandomNumUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingCars {

    private List<RacingCar> cars;

    public RacingCars(List<RacingCar> cars) {
        if (Objects.isNull(cars) || cars.isEmpty()) {
            throw new IllegalArgumentException("1대 이상의 차를 입력해주세요.");
        }
        this.cars = cars.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public RacingCars(String[] carNames) {
        this(Stream.of(carNames).map(RacingCar::new).collect(Collectors.toList()));
    }

    public void move() {
        cars.forEach(car -> car.moveForward(RandomNumUtils.generateRandomNum()));
    }

    public List<RacingCar> getCars() {
        return cars;
    }

    /*
     * 현재 위치(position)이 가장 높은 객체를 걸러낸 후
     * isSamePosition으로 걸러낸 객체가 확실히 맞는지 더블체크 한다
     * */
    public List<RacingCar> getWinners() {
        RacingCar winner = cars.stream()
                .max(Comparator.comparingInt(RacingCar::getCarPosition))
                .orElseThrow(IllegalStateException::new);

        return cars.stream()
                .filter(car -> car.isSamePosition(winner))
                .collect(Collectors.toList());
    }
}

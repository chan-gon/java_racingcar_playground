package racingcar_second.domain;

import racingcar_second.domain.exception.EmptyCarNameException;
import racingcar_second.utils.RandomUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private List<Car> cars;

    public Cars(String carNames) {
        if (carNames.isEmpty()) {
            throw new EmptyCarNameException();
        }
        String[] names = carNames.split(",");
        this.cars = Stream.of(names)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public List<Car> getCarList() {
        return cars;
    }

    public void move() {
        for (Car car : cars) {
            car.moveForward(RandomUtils.generateRandomNum());
        }
    }

    public List<String> getWinnerNames() {
        int maxPoint = getMaxPoint();
        return cars.stream()
                .filter(car -> maxPoint == car.getPosition())
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int getMaxPoint() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPosition))
                .get().getPosition();
    }

}

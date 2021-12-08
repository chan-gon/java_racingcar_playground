package racingcar_third.domain;

import racingcar_third.utils.RandomUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private List<Car> cars;

    public Cars(String carNames) {
        if (carNames.isEmpty()) {
            throw new IllegalArgumentException();
        }
        String[] carList = carNames.split(",");
        this.cars = Stream.of(carList)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public List<Car> createCarList() {
        return cars;
    }

    public void moveForward() {
        for (Car car : cars) {
            car.move(RandomUtils.getRandomNum());
        }
    }

    public List<String> getWinner() {
       int maxPosition = getMaxPosition();
       return cars.stream()
               .filter(car -> maxPosition == car.getCarPosition())
               .map(Car::getCarName)
               .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return cars.stream()
                .max(Comparator.comparing(Car::getCarPosition))
                .get().getCarPosition();
    }


}

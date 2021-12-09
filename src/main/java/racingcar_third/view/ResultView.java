package racingcar_third.view;

import racingcar_third.domain.RacingCar;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public void printWinner(List<RacingCar> winners) {
        String winnerNames = winners.stream().map(RacingCar::getCarName).collect(Collectors.joining(","));
        System.out.printf("%s가 최종 우승했습니다.", winnerNames);
    }

    public void printCarPosition(List<RacingCar> cars) {
        for (RacingCar car : cars) {
            printPosition(car);
        }
        System.out.println();
    }

    private void printPosition(RacingCar car) {
        System.out.print(car.getCarName() + " : ");
        for (int i = 0; i < car.getCarPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}

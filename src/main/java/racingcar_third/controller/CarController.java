package racingcar_third.controller;

import racingcar_third.domain.Cars;
import racingcar_third.view.ResultView;

public class CarController {

    public void startGame(String carNames, int attemptNum) {
        Cars cars = new Cars(carNames);
        startRacing(attemptNum, cars);
    }

    private void startRacing(int attemptNum, Cars cars) {
        System.out.println("실행 결과");
        ResultView resultView = new ResultView();
        for (int i = 0; i < attemptNum; i++) {
            cars.moveForward();
            resultView.showRacingResult(cars);
        }
        resultView.showRacingWinner(cars.getWinner());
    }
}

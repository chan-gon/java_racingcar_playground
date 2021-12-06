package racingcar_second.controller;

import racingcar_second.domain.Cars;
import racingcar_second.view.ResultView;

public class RacingController {

    public void startGame(String carName, int tryNumber) {
        Cars cars = new Cars(carName);
        tryRacing(tryNumber, cars);
    }

    private void tryRacing(int tryNumber, Cars cars) {
        System.out.println("실행 결과");
        ResultView resultView = new ResultView();
        for (int i = 0; i < tryNumber; i++) {
            cars.move();
            resultView.showRacingResult(cars);
        }
        resultView.showRacingWinner(cars.getWinnerNames());
    }
}

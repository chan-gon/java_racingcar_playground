package racingcar_third.view;

import racingcar_third.domain.Cars;

import java.util.List;

public class ResultView {

    public String showRacingPosition(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }

    public void showRacingResult(Cars cars) {
        StringBuilder stringBuilder = new StringBuilder();
        cars.createCarList().forEach(car -> {
            stringBuilder.append(car.getCarName());
            stringBuilder.append(" : ");
            stringBuilder.append(showRacingPosition(car.getCarPosition()));
            stringBuilder.append("\n");
        });
        System.out.println(stringBuilder.toString());
    }

    public void showRacingWinner(List<String> winners) {
        System.out.println(String.join(",", winners) + "가 최종 우승했습니다.");
    }
}

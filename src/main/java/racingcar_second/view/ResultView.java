package racingcar_second.view;

import racingcar_second.domain.Cars;

import java.util.List;

public class ResultView {

    private static final String MOVE_CAR = "-";

    public void showRacingResult(Cars cars) {
        StringBuilder stringBuilder = new StringBuilder();
        cars.getCarList().forEach(car -> {
            stringBuilder.append(car.getName());
            stringBuilder.append(" : ");
            stringBuilder.append(showRacingPosition(car.getPosition()));
            stringBuilder.append("\n");
        });
        System.out.println(stringBuilder.toString());
    }

    private String showRacingPosition(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(MOVE_CAR);
        }
        return stringBuilder.toString();
    }

    public void showRacingWinner(List<String> winners) {
        System.out.println(String.join(",", winners) + "가 최종 우승했습니다.");
    }

}

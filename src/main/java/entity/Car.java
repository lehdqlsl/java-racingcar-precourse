package entity;

import utils.ValidationUtils;

public class Car {
    private static final String MOVE_ONE_STEP = "-";
    private final String carName;
    private StringBuilder move;

    public Car(String carName) {
        if (!ValidationUtils.validCarName(carName)) {
            throw new IllegalArgumentException("자동차 이름의 길이가 올바르지 않습니다.(1~5글자)");
        }
        this.carName = carName;
        this.move = new StringBuilder();
    }

    public String getCarName() {
        return this.carName;
    }

    public void move() {
        this.move.append(MOVE_ONE_STEP);
    }

    public String getMove() {
        return this.move.toString();
    }
}

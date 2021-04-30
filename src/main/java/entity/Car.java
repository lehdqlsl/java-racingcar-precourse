package entity;

import utils.ValidationUtils;

public class Car {
    private static final int INIT_START = 0;
    private static final int MOVE_ONE_STEP = 1;
    private final String carName;
    private int move;

    public Car(String carName) {
        if (!ValidationUtils.validCarName(carName)) {
            throw new IllegalArgumentException("자동차 이름의 길이가 올바르지 않습니다.(1~5글자)");
        }
        this.carName = carName;
        this.move = INIT_START;
    }

    public String getCarName() {
        return this.carName;
    }

    public void move() {
        this.move += MOVE_ONE_STEP;
    }

    public int getMove() {
        return this.move;
    }

    public String printMove() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < move; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}

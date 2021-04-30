package utils;

import entity.Car;
import entity.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
    private static final int MOVE_NUMBER = 4;
    private static int moveWin = 0;

    public static void moveCar(Car car, int randomNo) {
        if (!ValidationUtils.validNo(randomNo)) {
            throw new IllegalArgumentException("랜덤숫자의 범위는 1~9 사이입니다.");
        }
        if (isMove(randomNo)) {
            car.move();
        }
    }

    private static boolean isMove(int no) {
        return no >= MOVE_NUMBER;
    }

    public static Cars getWinner(Cars cars) {
        List<Car> winList = new ArrayList<>();
        for (Car car : cars.getCarList()) {
            CarUtils.addWinner(winList, car);
        }
        return new Cars(winList);
    }

    private static void addWinner(List<Car> winList, Car car) {
        if (car.getMove().length() > moveWin) {
            winList.clear();
            winList.add(car);
            moveWin = car.getMove().length();
            return;
        }
        if (car.getMove().length() == moveWin) {
            winList.add(car);
        }
    }

    public static void startRacing(Cars cars) {
        int repeat = CommonUtils.inputRepeat();
        for (int i = 0; i < repeat; i++) {
            cars.moveCar();
            CommonUtils.printMove(cars);
        }
    }
}

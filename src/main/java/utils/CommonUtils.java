package utils;

import entity.Car;
import entity.Cars;
import entity.WinnerCars;

import java.util.Scanner;

public class CommonUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static void printCarInputInfo() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printNoInputInfo() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static String inputCar() {
        return scanner.nextLine();
    }

    public static int inputRepeat() {
        return scanner.nextInt();
    }

    public static void printMove(Cars cars) {
        System.out.println("실행 결과");
        for(Car car : cars.getCarList()){
            System.out.println(car.getCarName()+":"+car.printMove());
        }
        System.out.println();
    }

    public static void printWinner(WinnerCars winnerCars) {
        System.out.println(winnerCars.getWinnerCarName() + "가 취종 우승했습니다.");
    }

    public static void startRacing(Cars cars) {
        int repeat = CommonUtils.inputRepeat();
        for (int i = 0; i < repeat; i++) {
            cars.moveCar();
            CommonUtils.printMove(cars);
        }
    }
}

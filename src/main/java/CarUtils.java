import java.util.ArrayList;
import java.util.List;

public class CarUtils {
    private static final int MOVE_NUMBER = 4;
    private static final int INIT_MAX_MOVE = 0;
    private static int moveWin = 0;

    public static void moveCar(Car car, int randomNo) {
        if(!ValidationUtils.validNo(randomNo)){
            throw new IllegalArgumentException("랜덤숫자의 범위는 1~9 사이입니다.");
        }
        if (isMove(randomNo)) {
            car.move();
        }
    }

    private static boolean isMove(int no) {
        return no >= MOVE_NUMBER;
    }

    public static Cars createCars(String sCars) {
        List<Car> carList = new ArrayList<>();
        String[] array = sCars.split(",");
        for(String carName : array){
            carList.add(new Car(carName));
        }
        return new Cars(carList);
    }

    public static WinnerCars getWinner(Cars cars) {
        List<Car> winList = new ArrayList<>();
        for(Car car : cars.getCarList()){
            CarUtils.addWinner(winList, car);
        }
        return new WinnerCars(winList);
    }

    private static void addWinner(List<Car> winList , Car car) {
        if(car.getMove() > moveWin){
            winList.clear();
            winList.add(car);
            moveWin = car.getMove();
            return;
        }
        if(car.getMove() == moveWin){
            winList.add(car);
        }
    }
}

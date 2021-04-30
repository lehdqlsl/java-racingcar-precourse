import entity.Cars;
import utils.CarUtils;
import utils.CommonUtils;

public class Main {
    public static void main(String[] args) {
        CommonUtils.printCarInputInfo();
        Cars cars = CarUtils.createCars(CommonUtils.inputCar());
        CommonUtils.printNoInputInfo();
        CommonUtils.startRacing(cars);
        CommonUtils.printWinner(CarUtils.getWinner(cars));
    }
}

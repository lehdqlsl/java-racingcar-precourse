import entity.Cars;
import utils.CarUtils;
import utils.CommonUtils;

public class Main {
    public static void main(String[] args) {
        CommonUtils.printCarInputInfo();
        Cars cars = new Cars(CommonUtils.inputCar());
        CommonUtils.printNoInputInfo();
        CarUtils.startRacing(cars);
        CommonUtils.printWinner(CarUtils.getWinner(cars));
    }
}

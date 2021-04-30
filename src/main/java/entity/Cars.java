package entity;

import utils.CarUtils;

import java.util.List;
import java.util.Random;

public class Cars {
    private static final int RANDOM_MAX = 9;
    private static final int RANDOM_MIN = 1;
    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void moveCar() {
        Random random = new Random();
        for(Car car : carList){
            int randomNo = random.nextInt(RANDOM_MAX) + RANDOM_MIN;
            CarUtils.moveCar(car,randomNo);
        }
    }

}

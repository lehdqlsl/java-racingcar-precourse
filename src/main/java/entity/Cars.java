package entity;

import utils.CarUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {
    private static final int RANDOM_MAX = 9;
    private static final int RANDOM_MIN = 1;
    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public Cars(String sCars) {
        List<Car> carList = new ArrayList<>();
        String[] array = sCars.split(",");
        for (String carName : array) {
            carList.add(new Car(carName));
        }
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void moveCar() {
        Random random = new Random();
        for (Car car : carList) {
            int randomNo = random.nextInt(RANDOM_MAX) + RANDOM_MIN;
            CarUtils.moveCar(car, randomNo);
        }
    }

    public String getWinnerCarName() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < carList.size(); i++) {
            stringBuilder.append(carList.get(i).getCarName());
            stringBuilder.append(isAnd(i, carList.size()));
        }
        return stringBuilder.toString();
    }

    private String isAnd(int i, int size) {
        if (i < size - 1) {
            return ",";
        }
        return "";
    }
}

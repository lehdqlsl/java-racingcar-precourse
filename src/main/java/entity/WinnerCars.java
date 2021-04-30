package entity;

import java.util.List;

public class WinnerCars {
    private List<Car> carList;

    public WinnerCars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
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

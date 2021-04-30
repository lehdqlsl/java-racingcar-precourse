import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void moveCar() {
        for(Car car : carList){
            int randomNo = 5;
            CarUtils.moveCar(car,randomNo);
        }
    }

}

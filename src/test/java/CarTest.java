import entity.Car;
import entity.Cars;
import entity.WinnerCars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.CarUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Cars cars;
    @BeforeEach
    void setUp() {
        String sCars = "k5,bmw,benz,audi";
        cars = CarUtils.createCars(sCars);
        assertThat(cars.getCarList().get(0).getCarName()).isEqualTo("k5");
        assertThat(cars.getCarList().get(1).getCarName()).isEqualTo("bmw");
        assertThat(cars.getCarList().get(2).getCarName()).isEqualTo("benz");
        assertThat(cars.getCarList().get(3).getCarName()).isEqualTo("audi");
    }

    @Test
    void move() {
        Car k5 = new Car("k5");
        CarUtils.moveCar(k5,5);
        CarUtils.moveCar(k5,6);
        CarUtils.moveCar(k5,1);
        CarUtils.moveCar(k5,2);
        assertThat(k5.getMove()).isEqualTo(2);
    }

    @Test
    void find_winner() {
        cars.moveCar();
        WinnerCars winnerCars = CarUtils.getWinner(cars);
        assertThat(winnerCars.getCarList().get(0).getCarName()).isEqualTo("k5");
        assertThat(winnerCars.getCarList().get(1).getCarName()).isEqualTo("bmw");
        assertThat(winnerCars.getCarList().get(2).getCarName()).isEqualTo("benz");
        assertThat(winnerCars.getCarList().get(3).getCarName()).isEqualTo("audi");
    }

}

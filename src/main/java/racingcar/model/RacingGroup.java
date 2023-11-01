package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RacingGroup {
    List<Car> cars;

    public RacingGroup() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCarToGroup(String name) {
        this.cars.add(new Car(name));
    }
}

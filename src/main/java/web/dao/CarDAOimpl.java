package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAOimpl implements CarDAO {
    private final List<Car> cars = new ArrayList<>();
    private Car car = new Car("Volvo", 60, "Ivan");
    private Car car2 = new Car("Volvo", 70, "Vlad");
    private Car car3 = new Car("Volvo", 80, "Olga");
    private Car car4 = new Car("Volvo", 90, "Kot");
    private Car car5 = new Car("Volvo", 50, "Nick");

    {cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);}

    @Override
    public List<Car> addCar(List<Car> cars, Car car) {
        cars.add(car);
        return cars;
    }

    @Override
    public List<Car> getCarsStream(int n) {
        final List<Car> car = getCarsList().stream().limit(n).toList();
        return car;
    }
    @Override
    public List<Car> getCarsList() {
        return cars;
    }


}

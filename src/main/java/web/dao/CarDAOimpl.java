package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.List;
@Repository
public class CarDAOimpl implements CarDAO {

    @Override
    public List<Car> addCar(List<Car> cars, Car car) {
        cars.add(car);
        return cars;
    }

    @Override
    public List<Car> getCars(List<Car> car, int n) {
        return car.stream().limit(n).toList();
    }
}

package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.List;
@Repository
public interface CarDAO {
    public List<Car> addCar(List<Car> cars, Car car);
    public List<Car> getCarsStream(int n);
    public List<Car> getCarsList();

}

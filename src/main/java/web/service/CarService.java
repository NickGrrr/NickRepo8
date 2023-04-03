package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.dao.CarDAOimpl;
import web.entity.Car;

import java.util.List;

@Service
public interface CarService {
    public List<Car> addCar(List<Car> cars, Car car);
    public List<Car> getCarsStream(int n);
    public List<Car> getCarsList();
}


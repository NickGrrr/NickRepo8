package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.dao.CarDAOimpl;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    CarDAO carDAO = new CarDAOimpl();


    @Override
    public List<Car> addCar(List<Car> cars, Car car) {
        cars.add(car);
        return cars;
    }


    @Override
    public List<Car> getCars(List<Car> cars, int n) {
        return carDAO.getCars(cars, n);
    }
}

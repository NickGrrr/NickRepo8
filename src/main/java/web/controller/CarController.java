package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
@Autowired
    CarService carService;
    static List<Car> cars = new ArrayList<>();
    static Car car = new Car("Volvo", 60, "Ivan");
    static Car car2 = new Car("Volvo", 70, "Vlad");
    static Car car3 = new Car("Volvo", 80, "Olga");
    static Car car4 = new Car("Volvo", 90, "Kot");
    static Car car5 = new Car("Volvo", 50, "Nick");

    {cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);}
    @GetMapping(value = "/cars")
    public String getCars (@RequestParam(defaultValue = "5")  int count, Model model) {
        List<Car> cars1 = carService.getCars(cars, count);
        model.addAttribute("cars", cars1);
        return "cars";
    }
}

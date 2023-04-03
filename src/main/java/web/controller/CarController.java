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

//    @GetMapping(value = "/cars")
//    public String getCars (@RequestParam(defaultValue = "5")  int count, Model model) {
//        List<Car> cars = carService.getCarsList();
//        List<Car> cars1 = carService.getCarsStream(cars, count);
//        model.addAttribute("cars", cars1);
//        return "cars";
//    }
        @GetMapping(value = "/cars")
    public String getCars (@RequestParam(required = false)  Integer count, Model model) {
            if (count == null) {
                List<Car> cars = carService.getCarsList();
                model.addAttribute("cars", cars);
            } else {
                List<Car> cars = carService.getCarsStream(count);
                model.addAttribute("cars", cars);
            }
        return "cars";
    }
}
